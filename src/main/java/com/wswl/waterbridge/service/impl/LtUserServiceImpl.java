package com.wswl.waterbridge.service.impl;

import com.wswl.waterbridge.common.GuidUtil;
import com.wswl.waterbridge.dto.*;
import com.wswl.waterbridge.mapper.*;
import com.wswl.waterbridge.response.CommonResult;
import com.wswl.waterbridge.response.ResultCode;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

import com.wswl.waterbridge.service.LtUserService;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class LtUserServiceImpl implements LtUserService{

    @Resource
    private LtUserMapper ltUserMapper;
    @Resource
    private LtUserlevelMapper ltUserlevelMapper;
    @Resource
    private LtUserbalanceMapper ltUserbalanceMapper;
    @Resource
    private LtWalletMapper ltWalletMapper;
    @Resource
    private LtUserextendMapper ltUserextendMapper;
    @Resource
    private LtLevelextendMapper ltLevelextendMapper;


    @Transactional
    @Override
    public CommonResult register(LtUser user) {
        String recommend = user.getRecommend();//推荐人

        Map<String,Object> paramMap = new HashMap<>();
        //随机生成6位推荐码，并判断是否唯一
        String recomStr = GuidUtil.randomHexString(6);
        paramMap.put("recommend", recomStr);
        paramMap.put("limit", "1");
        LtUser ltUser = ltUserMapper.selectUser(paramMap);
        while (ltUser != null){
            recomStr = GuidUtil.randomHexString(6);
            paramMap.put("recommend", recomStr);
            ltUser = ltUserMapper.selectUser(paramMap);
        }
        paramMap.put("recommend", "");

        //判断uuid是否唯一
        String usn = GuidUtil.getUUID();
        paramMap.put("usn", usn);
        ltUser = ltUserMapper.selectUser(paramMap);
        while (ltUser != null){
            recomStr = GuidUtil.getUUID();
            paramMap.put("usn", recomStr);
            ltUser = ltUserMapper.selectUser(paramMap);
        }
        paramMap.put("usn", "");

        user.setUsn(usn);
        user.setTimes(System.currentTimeMillis());
        user.setLevel(1);
        user.setValied(1);
        user.setRecommend(recomStr);
        ltUserMapper.insertSelective(user);

        LtUserbalance userbalance = new LtUserbalance();
        userbalance.setUid(user.getUid());
        userbalance.setUsn(user.getUsn());
        userbalance.setAsset(1);
        userbalance.setAddress("");
        ltUserbalanceMapper.insertSelective(userbalance);

        LtUserextend userextend = new LtUserextend();
        userextend.setUid(user.getUid());
        userextend.setUsn(user.getUsn());


        //如果推荐人参数不为空
        if (StringUtils.isNotBlank(recommend)){
            //获取推荐人
            paramMap.put("recommend", recommend);
            LtUser recommendUser = ltUserMapper.selectUser(paramMap);

            if(recommendUser != null){
                userextend.setParent(recommendUser.getUid());

                LtUserlevel userlevel = new LtUserlevel();
                userlevel.setParent(recommendUser.getUid());
                userlevel.setUid(user.getUid());
                userlevel.setTimes(System.currentTimeMillis());
                ltUserlevelMapper.insert(userlevel);

                //插入推荐人数据
                LtLevelextend levelextend = new LtLevelextend();
                levelextend.setParent(recommendUser.getUid());
                levelextend.setUid(user.getUid());
                levelextend.setLevel(1);
                levelextend.setTimes(System.currentTimeMillis());
                ltLevelextendMapper.insertSelective(levelextend);

                paramMap.put("uid",recommendUser.getUid());
                List<LtLevelextend> levelextendList = ltLevelextendMapper.selectLevelList(paramMap);
                for (LtLevelextend vo: levelextendList) {
                    vo.setUid(user.getUid());
                    vo.setLevel(vo.getLevel() + 1);
                    vo.setTimes(System.currentTimeMillis());
                    ltLevelextendMapper.insertSelective(vo);
                }


            }else {
                return CommonResult.failed(ResultCode.RECOMMEND_ERROR);
            }
        }


        ltUserextendMapper.insertSelective(userextend);

        LtWallet ltWallet = new LtWallet();
        ltWallet.setUid(user.getUid());
        ltWallet.setUsn(user.getUsn());
        ltWallet.setAsset(2);
        ltWalletMapper.insertSelective(ltWallet);



        return CommonResult.success(user);
    }

    @Override
    public LtUser selectUser(Map<String,Object> map){
        return ltUserMapper.selectUser(map);
    }

    @Override
    public int deleteByPrimaryKey(Integer uid) {
        return ltUserMapper.deleteByPrimaryKey(uid);
    }

    @Override
    public int insert(LtUser record) {
        return ltUserMapper.insert(record);
    }

    @Override
    public int insertSelective(LtUser record) {
        return ltUserMapper.insertSelective(record);
    }

    @Override
    public LtUser selectByPrimaryKey(Integer uid) {
        return ltUserMapper.selectByPrimaryKey(uid);
    }

    @Override
    public int updateByPrimaryKeySelective(LtUser record) {
        return ltUserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(LtUser record) {
        return ltUserMapper.updateByPrimaryKey(record);
    }

}

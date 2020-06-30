package com.wswl.waterbridge.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.wswl.waterbridge.mapper.UserBaseInfoMapper;
import com.wswl.waterbridge.dto.UserBaseInfo;
import com.wswl.waterbridge.service.UserBaseInfoService;
@Service
public class UserBaseInfoServiceImpl implements UserBaseInfoService{

    @Resource
    private UserBaseInfoMapper userBaseInfoMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return userBaseInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UserBaseInfo record) {
        return userBaseInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(UserBaseInfo record) {
        return userBaseInfoMapper.insertSelective(record);
    }

    @Override
    public UserBaseInfo selectByPrimaryKey(String id) {
        return userBaseInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UserBaseInfo record) {
        return userBaseInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UserBaseInfo record) {
        return userBaseInfoMapper.updateByPrimaryKey(record);
    }

}

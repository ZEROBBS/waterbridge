package com.wswl.waterbridge.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.wswl.waterbridge.mapper.UserThirdInfoMapper;
import com.wswl.waterbridge.dto.UserThirdInfo;
import com.wswl.waterbridge.service.UserThirdInfoService;
@Service
public class UserThirdInfoServiceImpl implements UserThirdInfoService{

    @Resource
    private UserThirdInfoMapper userThirdInfoMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return userThirdInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UserThirdInfo record) {
        return userThirdInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(UserThirdInfo record) {
        return userThirdInfoMapper.insertSelective(record);
    }

    @Override
    public UserThirdInfo selectByPrimaryKey(String id) {
        return userThirdInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UserThirdInfo record) {
        return userThirdInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UserThirdInfo record) {
        return userThirdInfoMapper.updateByPrimaryKey(record);
    }

}

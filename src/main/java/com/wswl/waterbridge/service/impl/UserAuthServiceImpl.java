package com.wswl.waterbridge.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.wswl.waterbridge.mapper.UserAuthMapper;
import com.wswl.waterbridge.dto.UserAuth;
import com.wswl.waterbridge.service.UserAuthService;
@Service
public class UserAuthServiceImpl implements UserAuthService{

    @Resource
    private UserAuthMapper userAuthMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return userAuthMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UserAuth record) {
        return userAuthMapper.insert(record);
    }

    @Override
    public int insertSelective(UserAuth record) {
        return userAuthMapper.insertSelective(record);
    }

    @Override
    public UserAuth selectByPrimaryKey(String id) {
        return userAuthMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UserAuth record) {
        return userAuthMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UserAuth record) {
        return userAuthMapper.updateByPrimaryKey(record);
    }

}

package com.wswl.waterbridge.service;

import com.wswl.waterbridge.mapper.UserAuthMapper;
import com.wswl.waterbridge.dto.UserAuth;
public interface UserAuthService{


    int deleteByPrimaryKey(String id);

    int insert(UserAuth record);

    int insertSelective(UserAuth record);

    UserAuth selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(UserAuth record);

    int updateByPrimaryKey(UserAuth record);

}

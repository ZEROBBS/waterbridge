package com.wswl.waterbridge.service;

import com.wswl.waterbridge.mapper.UserBaseInfoMapper;
import com.wswl.waterbridge.dto.UserBaseInfo;
public interface UserBaseInfoService{


    int deleteByPrimaryKey(String id);

    int insert(UserBaseInfo record);

    int insertSelective(UserBaseInfo record);

    UserBaseInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(UserBaseInfo record);

    int updateByPrimaryKey(UserBaseInfo record);

}

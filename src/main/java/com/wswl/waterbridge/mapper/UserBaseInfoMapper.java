package com.wswl.waterbridge.mapper;

import com.wswl.waterbridge.dto.UserBaseInfo;

public interface UserBaseInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(UserBaseInfo record);

    int insertSelective(UserBaseInfo record);

    UserBaseInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(UserBaseInfo record);

    int updateByPrimaryKey(UserBaseInfo record);
}
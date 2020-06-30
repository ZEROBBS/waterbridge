package com.wswl.waterbridge.mapper;

import com.wswl.waterbridge.dto.UserAuth;

public interface UserAuthMapper {
    int deleteByPrimaryKey(String id);

    int insert(UserAuth record);

    int insertSelective(UserAuth record);

    UserAuth selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(UserAuth record);

    int updateByPrimaryKey(UserAuth record);
}
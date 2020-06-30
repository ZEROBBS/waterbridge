package com.wswl.waterbridge.mapper;

import com.wswl.waterbridge.dto.UserThirdInfo;

public interface UserThirdInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(UserThirdInfo record);

    int insertSelective(UserThirdInfo record);

    UserThirdInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(UserThirdInfo record);

    int updateByPrimaryKey(UserThirdInfo record);
}
package com.wswl.waterbridge.mapper;

import com.wswl.waterbridge.dto.DAppPlatform;

public interface DAppPlatformMapper {
    int deleteByPrimaryKey(String id);

    int insert(DAppPlatform record);

    int insertSelective(DAppPlatform record);

    DAppPlatform selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(DAppPlatform record);

    int updateByPrimaryKey(DAppPlatform record);
}
package com.wswl.waterbridge.service;

import com.wswl.waterbridge.mapper.DAppPlatformMapper;
import com.wswl.waterbridge.dto.DAppPlatform;
public interface DAppPlatformService{


    int deleteByPrimaryKey(String id);

    int insert(DAppPlatform record);

    int insertSelective(DAppPlatform record);

    DAppPlatform selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(DAppPlatform record);

    int updateByPrimaryKey(DAppPlatform record);

}

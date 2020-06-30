package com.wswl.waterbridge.mapper;

import com.wswl.waterbridge.dto.SysUpdateInfo;

public interface SysUpdateInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(SysUpdateInfo record);

    int insertSelective(SysUpdateInfo record);

    SysUpdateInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysUpdateInfo record);

    int updateByPrimaryKey(SysUpdateInfo record);
}
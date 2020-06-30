package com.wswl.waterbridge.mapper;

import com.wswl.waterbridge.dto.SysSearchInfo;

public interface SysSearchInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(SysSearchInfo record);

    int insertSelective(SysSearchInfo record);

    SysSearchInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysSearchInfo record);

    int updateByPrimaryKey(SysSearchInfo record);
}
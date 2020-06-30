package com.wswl.waterbridge.mapper;

import com.wswl.waterbridge.dto.SysShare;

public interface SysShareMapper {
    int deleteByPrimaryKey(String id);

    int insert(SysShare record);

    int insertSelective(SysShare record);

    SysShare selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysShare record);

    int updateByPrimaryKey(SysShare record);
}
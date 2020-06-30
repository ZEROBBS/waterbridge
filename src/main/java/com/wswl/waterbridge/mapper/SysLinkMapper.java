package com.wswl.waterbridge.mapper;

import com.wswl.waterbridge.dto.SysLink;

public interface SysLinkMapper {
    int deleteByPrimaryKey(String id);

    int insert(SysLink record);

    int insertSelective(SysLink record);

    SysLink selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysLink record);

    int updateByPrimaryKey(SysLink record);
}
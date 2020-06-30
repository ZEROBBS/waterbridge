package com.wswl.waterbridge.mapper;

import com.wswl.waterbridge.dto.SysAccount;

public interface SysAccountMapper {
    int deleteByPrimaryKey(String id);

    int insert(SysAccount record);

    int insertSelective(SysAccount record);

    SysAccount selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysAccount record);

    int updateByPrimaryKey(SysAccount record);
}
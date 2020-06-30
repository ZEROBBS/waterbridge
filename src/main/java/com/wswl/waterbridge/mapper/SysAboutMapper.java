package com.wswl.waterbridge.mapper;

import com.wswl.waterbridge.dto.SysAbout;

public interface SysAboutMapper {
    int deleteByPrimaryKey(String id);

    int insert(SysAbout record);

    int insertSelective(SysAbout record);

    SysAbout selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysAbout record);

    int updateByPrimaryKey(SysAbout record);
}
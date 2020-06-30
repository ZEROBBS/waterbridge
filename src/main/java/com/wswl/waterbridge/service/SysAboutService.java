package com.wswl.waterbridge.service;

import com.wswl.waterbridge.mapper.SysAboutMapper;
import com.wswl.waterbridge.dto.SysAbout;
public interface SysAboutService{


    int deleteByPrimaryKey(String id);

    int insert(SysAbout record);

    int insertSelective(SysAbout record);

    SysAbout selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysAbout record);

    int updateByPrimaryKey(SysAbout record);

}

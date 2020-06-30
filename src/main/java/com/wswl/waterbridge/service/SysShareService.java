package com.wswl.waterbridge.service;

import com.wswl.waterbridge.mapper.SysShareMapper;
import com.wswl.waterbridge.dto.SysShare;
public interface SysShareService{


    int deleteByPrimaryKey(String id);

    int insert(SysShare record);

    int insertSelective(SysShare record);

    SysShare selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysShare record);

    int updateByPrimaryKey(SysShare record);

}

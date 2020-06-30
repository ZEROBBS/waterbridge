package com.wswl.waterbridge.service;

import com.wswl.waterbridge.dto.SysSearchInfo;
import com.wswl.waterbridge.mapper.SysSearchInfoMapper;
public interface SysSearchInfoService{


    int deleteByPrimaryKey(String id);

    int insert(SysSearchInfo record);

    int insertSelective(SysSearchInfo record);

    SysSearchInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysSearchInfo record);

    int updateByPrimaryKey(SysSearchInfo record);

}

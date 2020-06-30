package com.wswl.waterbridge.service;

import com.wswl.waterbridge.mapper.SysUpdateInfoMapper;
import com.wswl.waterbridge.dto.SysUpdateInfo;
public interface SysUpdateInfoService{


    int deleteByPrimaryKey(String id);

    int insert(SysUpdateInfo record);

    int insertSelective(SysUpdateInfo record);

    SysUpdateInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysUpdateInfo record);

    int updateByPrimaryKey(SysUpdateInfo record);

}

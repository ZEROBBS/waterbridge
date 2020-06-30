package com.wswl.waterbridge.service;

import com.wswl.waterbridge.mapper.SysAccountMapper;
import com.wswl.waterbridge.dto.SysAccount;
public interface SysAccountService{


    int deleteByPrimaryKey(String id);

    int insert(SysAccount record);

    int insertSelective(SysAccount record);

    SysAccount selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysAccount record);

    int updateByPrimaryKey(SysAccount record);

}

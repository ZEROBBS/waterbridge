package com.wswl.waterbridge.service;

import com.wswl.waterbridge.dto.SysRole;
import com.wswl.waterbridge.mapper.SysRoleMapper;
public interface SysRoleService{


    int deleteByPrimaryKey(String id);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    SysRole selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);

}

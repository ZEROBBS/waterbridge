package com.wswl.waterbridge.service;

import com.wswl.waterbridge.mapper.SysLinkMapper;
import com.wswl.waterbridge.dto.SysLink;
public interface SysLinkService{


    int deleteByPrimaryKey(String id);

    int insert(SysLink record);

    int insertSelective(SysLink record);

    SysLink selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysLink record);

    int updateByPrimaryKey(SysLink record);

}

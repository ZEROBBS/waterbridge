package com.wswl.waterbridge.mapper;

import com.wswl.waterbridge.dto.SysMarket;

public interface SysMarketMapper {
    int deleteByPrimaryKey(String id);

    int insert(SysMarket record);

    int insertSelective(SysMarket record);

    SysMarket selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysMarket record);

    int updateByPrimaryKey(SysMarket record);
}
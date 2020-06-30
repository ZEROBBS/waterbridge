package com.wswl.waterbridge.service;

import com.wswl.waterbridge.dto.SysMarket;
import com.wswl.waterbridge.mapper.SysMarketMapper;
public interface SysMarketService{


    int deleteByPrimaryKey(String id);

    int insert(SysMarket record);

    int insertSelective(SysMarket record);

    SysMarket selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysMarket record);

    int updateByPrimaryKey(SysMarket record);

}

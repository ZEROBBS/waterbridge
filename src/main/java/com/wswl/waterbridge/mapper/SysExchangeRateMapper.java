package com.wswl.waterbridge.mapper;

import com.wswl.waterbridge.dto.SysExchangeRate;

public interface SysExchangeRateMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysExchangeRate record);

    int insertSelective(SysExchangeRate record);

    SysExchangeRate selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysExchangeRate record);

    int updateByPrimaryKey(SysExchangeRate record);
}
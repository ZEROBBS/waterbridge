package com.wswl.waterbridge.service;

import com.wswl.waterbridge.mapper.SysExchangeRateMapper;
import com.wswl.waterbridge.dto.SysExchangeRate;
public interface SysExchangeRateService{


    int deleteByPrimaryKey(Integer id);

    int insert(SysExchangeRate record);

    int insertSelective(SysExchangeRate record);

    SysExchangeRate selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysExchangeRate record);

    int updateByPrimaryKey(SysExchangeRate record);

}

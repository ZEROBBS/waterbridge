package com.wswl.waterbridge.service;

import com.wswl.waterbridge.mapper.LtCurrencyMapper;
import com.wswl.waterbridge.dto.LtCurrency;
public interface LtCurrencyService{


    int deleteByPrimaryKey(Integer id);

    int insert(LtCurrency record);

    int insertSelective(LtCurrency record);

    LtCurrency selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LtCurrency record);

    int updateByPrimaryKey(LtCurrency record);

}

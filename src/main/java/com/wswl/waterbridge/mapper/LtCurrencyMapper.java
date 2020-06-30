package com.wswl.waterbridge.mapper;

import com.wswl.waterbridge.dto.LtCurrency;

public interface LtCurrencyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LtCurrency record);

    int insertSelective(LtCurrency record);

    LtCurrency selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LtCurrency record);

    int updateByPrimaryKey(LtCurrency record);
}
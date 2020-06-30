package com.wswl.waterbridge.mapper;

import com.wswl.waterbridge.dto.LtExchange;

public interface LtExchangeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LtExchange record);

    int insertSelective(LtExchange record);

    LtExchange selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LtExchange record);

    int updateByPrimaryKey(LtExchange record);
}
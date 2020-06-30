package com.wswl.waterbridge.service;

import com.wswl.waterbridge.mapper.LtExchangeMapper;
import com.wswl.waterbridge.dto.LtExchange;
public interface LtExchangeService{


    int deleteByPrimaryKey(Integer id);

    int insert(LtExchange record);

    int insertSelective(LtExchange record);

    LtExchange selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LtExchange record);

    int updateByPrimaryKey(LtExchange record);

}

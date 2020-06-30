package com.wswl.waterbridge.service;

import com.wswl.waterbridge.dto.LtCoinbalance;
import com.wswl.waterbridge.mapper.LtCoinbalanceMapper;
public interface LtCoinbalanceService{


    int deleteByPrimaryKey(Integer id);

    int insert(LtCoinbalance record);

    int insertSelective(LtCoinbalance record);

    LtCoinbalance selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LtCoinbalance record);

    int updateByPrimaryKey(LtCoinbalance record);

}

package com.wswl.waterbridge.mapper;

import com.wswl.waterbridge.dto.LtCoinbalance;

public interface LtCoinbalanceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LtCoinbalance record);

    int insertSelective(LtCoinbalance record);

    LtCoinbalance selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LtCoinbalance record);

    int updateByPrimaryKey(LtCoinbalance record);
}
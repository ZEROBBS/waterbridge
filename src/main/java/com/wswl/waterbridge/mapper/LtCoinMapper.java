package com.wswl.waterbridge.mapper;

import com.wswl.waterbridge.dto.LtCoin;

public interface LtCoinMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LtCoin record);

    int insertSelective(LtCoin record);

    LtCoin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LtCoin record);

    int updateByPrimaryKey(LtCoin record);
}
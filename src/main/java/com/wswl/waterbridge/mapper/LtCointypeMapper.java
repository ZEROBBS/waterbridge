package com.wswl.waterbridge.mapper;

import com.wswl.waterbridge.dto.LtCointype;

public interface LtCointypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LtCointype record);

    int insertSelective(LtCointype record);

    LtCointype selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LtCointype record);

    int updateByPrimaryKey(LtCointype record);
}
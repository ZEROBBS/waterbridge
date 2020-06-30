package com.wswl.waterbridge.mapper;

import com.wswl.waterbridge.dto.LtSettle;

public interface LtSettleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LtSettle record);

    int insertSelective(LtSettle record);

    LtSettle selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LtSettle record);

    int updateByPrimaryKey(LtSettle record);
}
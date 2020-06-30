package com.wswl.waterbridge.mapper;

import com.wswl.waterbridge.dto.LtRecharge;

public interface LtRechargeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LtRecharge record);

    int insertSelective(LtRecharge record);

    LtRecharge selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LtRecharge record);

    int updateByPrimaryKey(LtRecharge record);
}
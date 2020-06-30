package com.wswl.waterbridge.service;

import com.wswl.waterbridge.dto.LtRecharge;
import com.wswl.waterbridge.mapper.LtRechargeMapper;
public interface LtRechargeService{


    int deleteByPrimaryKey(Integer id);

    int insert(LtRecharge record);

    int insertSelective(LtRecharge record);

    LtRecharge selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LtRecharge record);

    int updateByPrimaryKey(LtRecharge record);

}

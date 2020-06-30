package com.wswl.waterbridge.service;

import com.wswl.waterbridge.dto.LtSettle;
import com.wswl.waterbridge.mapper.LtSettleMapper;
public interface LtSettleService{


    int deleteByPrimaryKey(Long id);

    int insert(LtSettle record);

    int insertSelective(LtSettle record);

    LtSettle selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LtSettle record);

    int updateByPrimaryKey(LtSettle record);

}

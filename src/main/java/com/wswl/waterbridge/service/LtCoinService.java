package com.wswl.waterbridge.service;

import com.wswl.waterbridge.mapper.LtCoinMapper;
import com.wswl.waterbridge.dto.LtCoin;
public interface LtCoinService{


    int deleteByPrimaryKey(Integer id);

    int insert(LtCoin record);

    int insertSelective(LtCoin record);

    LtCoin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LtCoin record);

    int updateByPrimaryKey(LtCoin record);

}

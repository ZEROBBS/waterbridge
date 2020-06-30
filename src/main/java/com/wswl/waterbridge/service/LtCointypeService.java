package com.wswl.waterbridge.service;

import com.wswl.waterbridge.dto.LtCointype;
import com.wswl.waterbridge.mapper.LtCointypeMapper;
public interface LtCointypeService{


    int deleteByPrimaryKey(Integer id);

    int insert(LtCointype record);

    int insertSelective(LtCointype record);

    LtCointype selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LtCointype record);

    int updateByPrimaryKey(LtCointype record);

}

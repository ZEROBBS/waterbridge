package com.wswl.waterbridge.service;

import com.wswl.waterbridge.dto.LtAddress;
import com.wswl.waterbridge.mapper.LtAddressMapper;
public interface LtAddressService{


    int deleteByPrimaryKey(Integer id);

    int insert(LtAddress record);

    int insertSelective(LtAddress record);

    LtAddress selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LtAddress record);

    int updateByPrimaryKey(LtAddress record);

}

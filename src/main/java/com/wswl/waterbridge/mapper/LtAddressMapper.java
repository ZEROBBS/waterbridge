package com.wswl.waterbridge.mapper;

import com.wswl.waterbridge.dto.LtAddress;

public interface LtAddressMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LtAddress record);

    int insertSelective(LtAddress record);

    LtAddress selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LtAddress record);

    int updateByPrimaryKey(LtAddress record);
}
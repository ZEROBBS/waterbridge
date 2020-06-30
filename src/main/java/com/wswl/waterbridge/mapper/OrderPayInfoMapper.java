package com.wswl.waterbridge.mapper;

import com.wswl.waterbridge.dto.OrderPayInfo;

public interface OrderPayInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(OrderPayInfo record);

    int insertSelective(OrderPayInfo record);

    OrderPayInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OrderPayInfo record);

    int updateByPrimaryKey(OrderPayInfo record);
}
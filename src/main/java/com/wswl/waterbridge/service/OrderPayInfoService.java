package com.wswl.waterbridge.service;

import com.wswl.waterbridge.dto.OrderPayInfo;
import com.wswl.waterbridge.mapper.OrderPayInfoMapper;
public interface OrderPayInfoService{


    int deleteByPrimaryKey(String id);

    int insert(OrderPayInfo record);

    int insertSelective(OrderPayInfo record);

    OrderPayInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OrderPayInfo record);

    int updateByPrimaryKey(OrderPayInfo record);

}

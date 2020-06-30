package com.wswl.waterbridge.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.wswl.waterbridge.dto.OrderPayInfo;
import com.wswl.waterbridge.mapper.OrderPayInfoMapper;
import com.wswl.waterbridge.service.OrderPayInfoService;
@Service
public class OrderPayInfoServiceImpl implements OrderPayInfoService{

    @Resource
    private OrderPayInfoMapper orderPayInfoMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return orderPayInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(OrderPayInfo record) {
        return orderPayInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(OrderPayInfo record) {
        return orderPayInfoMapper.insertSelective(record);
    }

    @Override
    public OrderPayInfo selectByPrimaryKey(String id) {
        return orderPayInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(OrderPayInfo record) {
        return orderPayInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(OrderPayInfo record) {
        return orderPayInfoMapper.updateByPrimaryKey(record);
    }

}

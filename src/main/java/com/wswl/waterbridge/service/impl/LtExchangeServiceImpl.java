package com.wswl.waterbridge.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.wswl.waterbridge.mapper.LtExchangeMapper;
import com.wswl.waterbridge.dto.LtExchange;
import com.wswl.waterbridge.service.LtExchangeService;
@Service
public class LtExchangeServiceImpl implements LtExchangeService{

    @Resource
    private LtExchangeMapper ltExchangeMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return ltExchangeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(LtExchange record) {
        return ltExchangeMapper.insert(record);
    }

    @Override
    public int insertSelective(LtExchange record) {
        return ltExchangeMapper.insertSelective(record);
    }

    @Override
    public LtExchange selectByPrimaryKey(Integer id) {
        return ltExchangeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(LtExchange record) {
        return ltExchangeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(LtExchange record) {
        return ltExchangeMapper.updateByPrimaryKey(record);
    }

}

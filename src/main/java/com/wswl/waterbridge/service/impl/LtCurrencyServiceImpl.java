package com.wswl.waterbridge.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.wswl.waterbridge.mapper.LtCurrencyMapper;
import com.wswl.waterbridge.dto.LtCurrency;
import com.wswl.waterbridge.service.LtCurrencyService;
@Service
public class LtCurrencyServiceImpl implements LtCurrencyService{

    @Resource
    private LtCurrencyMapper ltCurrencyMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return ltCurrencyMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(LtCurrency record) {
        return ltCurrencyMapper.insert(record);
    }

    @Override
    public int insertSelective(LtCurrency record) {
        return ltCurrencyMapper.insertSelective(record);
    }

    @Override
    public LtCurrency selectByPrimaryKey(Integer id) {
        return ltCurrencyMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(LtCurrency record) {
        return ltCurrencyMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(LtCurrency record) {
        return ltCurrencyMapper.updateByPrimaryKey(record);
    }

}

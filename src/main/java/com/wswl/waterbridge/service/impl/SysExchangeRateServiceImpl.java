package com.wswl.waterbridge.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.wswl.waterbridge.mapper.SysExchangeRateMapper;
import com.wswl.waterbridge.dto.SysExchangeRate;
import com.wswl.waterbridge.service.SysExchangeRateService;
@Service
public class SysExchangeRateServiceImpl implements SysExchangeRateService{

    @Resource
    private SysExchangeRateMapper sysExchangeRateMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return sysExchangeRateMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SysExchangeRate record) {
        return sysExchangeRateMapper.insert(record);
    }

    @Override
    public int insertSelective(SysExchangeRate record) {
        return sysExchangeRateMapper.insertSelective(record);
    }

    @Override
    public SysExchangeRate selectByPrimaryKey(Integer id) {
        return sysExchangeRateMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SysExchangeRate record) {
        return sysExchangeRateMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SysExchangeRate record) {
        return sysExchangeRateMapper.updateByPrimaryKey(record);
    }

}

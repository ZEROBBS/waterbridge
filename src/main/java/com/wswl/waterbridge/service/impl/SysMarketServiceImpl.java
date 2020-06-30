package com.wswl.waterbridge.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.wswl.waterbridge.dto.SysMarket;
import com.wswl.waterbridge.mapper.SysMarketMapper;
import com.wswl.waterbridge.service.SysMarketService;
@Service
public class SysMarketServiceImpl implements SysMarketService{

    @Resource
    private SysMarketMapper sysMarketMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return sysMarketMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SysMarket record) {
        return sysMarketMapper.insert(record);
    }

    @Override
    public int insertSelective(SysMarket record) {
        return sysMarketMapper.insertSelective(record);
    }

    @Override
    public SysMarket selectByPrimaryKey(String id) {
        return sysMarketMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SysMarket record) {
        return sysMarketMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SysMarket record) {
        return sysMarketMapper.updateByPrimaryKey(record);
    }

}

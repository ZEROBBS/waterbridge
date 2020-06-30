package com.wswl.waterbridge.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.wswl.waterbridge.dto.LtUserdapp;
import com.wswl.waterbridge.mapper.LtUserdappMapper;
import com.wswl.waterbridge.service.LtUserdappService;
@Service
public class LtUserdappServiceImpl implements LtUserdappService{

    @Resource
    private LtUserdappMapper ltUserdappMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return ltUserdappMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(LtUserdapp record) {
        return ltUserdappMapper.insert(record);
    }

    @Override
    public int insertSelective(LtUserdapp record) {
        return ltUserdappMapper.insertSelective(record);
    }

    @Override
    public LtUserdapp selectByPrimaryKey(Integer id) {
        return ltUserdappMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(LtUserdapp record) {
        return ltUserdappMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(LtUserdapp record) {
        return ltUserdappMapper.updateByPrimaryKey(record);
    }

}

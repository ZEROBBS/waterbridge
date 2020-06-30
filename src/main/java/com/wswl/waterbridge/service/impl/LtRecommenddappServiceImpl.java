package com.wswl.waterbridge.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.wswl.waterbridge.dto.LtRecommenddapp;
import com.wswl.waterbridge.mapper.LtRecommenddappMapper;
import com.wswl.waterbridge.service.LtRecommenddappService;
@Service
public class LtRecommenddappServiceImpl implements LtRecommenddappService{

    @Resource
    private LtRecommenddappMapper ltRecommenddappMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return ltRecommenddappMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(LtRecommenddapp record) {
        return ltRecommenddappMapper.insert(record);
    }

    @Override
    public int insertSelective(LtRecommenddapp record) {
        return ltRecommenddappMapper.insertSelective(record);
    }

    @Override
    public LtRecommenddapp selectByPrimaryKey(Integer id) {
        return ltRecommenddappMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(LtRecommenddapp record) {
        return ltRecommenddappMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(LtRecommenddapp record) {
        return ltRecommenddappMapper.updateByPrimaryKey(record);
    }

}

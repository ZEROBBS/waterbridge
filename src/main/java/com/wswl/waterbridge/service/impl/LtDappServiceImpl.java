package com.wswl.waterbridge.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.wswl.waterbridge.mapper.LtDappMapper;
import com.wswl.waterbridge.dto.LtDapp;
import com.wswl.waterbridge.service.LtDappService;
@Service
public class LtDappServiceImpl implements LtDappService{

    @Resource
    private LtDappMapper ltDappMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return ltDappMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(LtDapp record) {
        return ltDappMapper.insert(record);
    }

    @Override
    public int insertSelective(LtDapp record) {
        return ltDappMapper.insertSelective(record);
    }

    @Override
    public LtDapp selectByPrimaryKey(Integer id) {
        return ltDappMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(LtDapp record) {
        return ltDappMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(LtDapp record) {
        return ltDappMapper.updateByPrimaryKey(record);
    }

}

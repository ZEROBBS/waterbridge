package com.wswl.waterbridge.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.wswl.waterbridge.dto.LtCoinbalance;
import com.wswl.waterbridge.mapper.LtCoinbalanceMapper;
import com.wswl.waterbridge.service.LtCoinbalanceService;
@Service
public class LtCoinbalanceServiceImpl implements LtCoinbalanceService{

    @Resource
    private LtCoinbalanceMapper ltCoinbalanceMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return ltCoinbalanceMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(LtCoinbalance record) {
        return ltCoinbalanceMapper.insert(record);
    }

    @Override
    public int insertSelective(LtCoinbalance record) {
        return ltCoinbalanceMapper.insertSelective(record);
    }

    @Override
    public LtCoinbalance selectByPrimaryKey(Integer id) {
        return ltCoinbalanceMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(LtCoinbalance record) {
        return ltCoinbalanceMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(LtCoinbalance record) {
        return ltCoinbalanceMapper.updateByPrimaryKey(record);
    }

}

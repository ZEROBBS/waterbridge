package com.wswl.waterbridge.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.wswl.waterbridge.mapper.LtCoinMapper;
import com.wswl.waterbridge.dto.LtCoin;
import com.wswl.waterbridge.service.LtCoinService;
@Service
public class LtCoinServiceImpl implements LtCoinService{

    @Resource
    private LtCoinMapper ltCoinMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return ltCoinMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(LtCoin record) {
        return ltCoinMapper.insert(record);
    }

    @Override
    public int insertSelective(LtCoin record) {
        return ltCoinMapper.insertSelective(record);
    }

    @Override
    public LtCoin selectByPrimaryKey(Integer id) {
        return ltCoinMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(LtCoin record) {
        return ltCoinMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(LtCoin record) {
        return ltCoinMapper.updateByPrimaryKey(record);
    }

}

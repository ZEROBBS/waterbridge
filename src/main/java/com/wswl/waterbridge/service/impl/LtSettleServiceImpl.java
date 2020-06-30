package com.wswl.waterbridge.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.wswl.waterbridge.dto.LtSettle;
import com.wswl.waterbridge.mapper.LtSettleMapper;
import com.wswl.waterbridge.service.LtSettleService;
@Service
public class LtSettleServiceImpl implements LtSettleService{

    @Resource
    private LtSettleMapper ltSettleMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return ltSettleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(LtSettle record) {
        return ltSettleMapper.insert(record);
    }

    @Override
    public int insertSelective(LtSettle record) {
        return ltSettleMapper.insertSelective(record);
    }

    @Override
    public LtSettle selectByPrimaryKey(Long id) {
        return ltSettleMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(LtSettle record) {
        return ltSettleMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(LtSettle record) {
        return ltSettleMapper.updateByPrimaryKey(record);
    }

}

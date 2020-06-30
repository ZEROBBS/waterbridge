package com.wswl.waterbridge.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.wswl.waterbridge.dto.LtRecharge;
import com.wswl.waterbridge.mapper.LtRechargeMapper;
import com.wswl.waterbridge.service.LtRechargeService;
@Service
public class LtRechargeServiceImpl implements LtRechargeService{

    @Resource
    private LtRechargeMapper ltRechargeMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return ltRechargeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(LtRecharge record) {
        return ltRechargeMapper.insert(record);
    }

    @Override
    public int insertSelective(LtRecharge record) {
        return ltRechargeMapper.insertSelective(record);
    }

    @Override
    public LtRecharge selectByPrimaryKey(Integer id) {
        return ltRechargeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(LtRecharge record) {
        return ltRechargeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(LtRecharge record) {
        return ltRechargeMapper.updateByPrimaryKey(record);
    }

}

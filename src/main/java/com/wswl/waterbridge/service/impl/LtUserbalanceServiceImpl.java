package com.wswl.waterbridge.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.wswl.waterbridge.mapper.LtUserbalanceMapper;
import com.wswl.waterbridge.dto.LtUserbalance;
import com.wswl.waterbridge.service.LtUserbalanceService;
@Service
public class LtUserbalanceServiceImpl implements LtUserbalanceService{

    @Resource
    private LtUserbalanceMapper ltUserbalanceMapper;

    @Override
    public int deleteByPrimaryKey(Integer uid) {
        return ltUserbalanceMapper.deleteByPrimaryKey(uid);
    }

    @Override
    public int insert(LtUserbalance record) {
        return ltUserbalanceMapper.insert(record);
    }

    @Override
    public int insertSelective(LtUserbalance record) {
        return ltUserbalanceMapper.insertSelective(record);
    }

    @Override
    public LtUserbalance selectByPrimaryKey(Integer uid) {
        return ltUserbalanceMapper.selectByPrimaryKey(uid);
    }

    @Override
    public int updateByPrimaryKeySelective(LtUserbalance record) {
        return ltUserbalanceMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(LtUserbalance record) {
        return ltUserbalanceMapper.updateByPrimaryKey(record);
    }

}

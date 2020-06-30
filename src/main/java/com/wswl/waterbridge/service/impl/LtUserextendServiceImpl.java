package com.wswl.waterbridge.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.wswl.waterbridge.dto.LtUserextend;
import com.wswl.waterbridge.mapper.LtUserextendMapper;
import com.wswl.waterbridge.service.LtUserextendService;
@Service
public class LtUserextendServiceImpl implements LtUserextendService{

    @Resource
    private LtUserextendMapper ltUserextendMapper;

    @Override
    public int deleteByPrimaryKey(Integer uid) {
        return ltUserextendMapper.deleteByPrimaryKey(uid);
    }

    @Override
    public int insert(LtUserextend record) {
        return ltUserextendMapper.insert(record);
    }

    @Override
    public int insertSelective(LtUserextend record) {
        return ltUserextendMapper.insertSelective(record);
    }

    @Override
    public LtUserextend selectByPrimaryKey(Integer uid) {
        return ltUserextendMapper.selectByPrimaryKey(uid);
    }

    @Override
    public int updateByPrimaryKeySelective(LtUserextend record) {
        return ltUserextendMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(LtUserextend record) {
        return ltUserextendMapper.updateByPrimaryKey(record);
    }

}

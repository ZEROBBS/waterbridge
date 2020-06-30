package com.wswl.waterbridge.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.wswl.waterbridge.mapper.LtLevelextendMapper;
import com.wswl.waterbridge.dto.LtLevelextend;
import com.wswl.waterbridge.service.LtLevelextendService;
@Service
public class LtLevelextendServiceImpl implements LtLevelextendService{

    @Resource
    private LtLevelextendMapper ltLevelextendMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return ltLevelextendMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(LtLevelextend record) {
        return ltLevelextendMapper.insert(record);
    }

    @Override
    public int insertSelective(LtLevelextend record) {
        return ltLevelextendMapper.insertSelective(record);
    }

    @Override
    public LtLevelextend selectByPrimaryKey(Integer id) {
        return ltLevelextendMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(LtLevelextend record) {
        return ltLevelextendMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(LtLevelextend record) {
        return ltLevelextendMapper.updateByPrimaryKey(record);
    }

}

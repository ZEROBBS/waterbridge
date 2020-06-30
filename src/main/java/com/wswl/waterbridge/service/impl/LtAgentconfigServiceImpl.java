package com.wswl.waterbridge.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.wswl.waterbridge.mapper.LtAgentconfigMapper;
import com.wswl.waterbridge.dto.LtAgentconfig;
import com.wswl.waterbridge.service.LtAgentconfigService;
@Service
public class LtAgentconfigServiceImpl implements LtAgentconfigService{

    @Resource
    private LtAgentconfigMapper ltAgentconfigMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return ltAgentconfigMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(LtAgentconfig record) {
        return ltAgentconfigMapper.insert(record);
    }

    @Override
    public int insertSelective(LtAgentconfig record) {
        return ltAgentconfigMapper.insertSelective(record);
    }

    @Override
    public LtAgentconfig selectByPrimaryKey(Integer id) {
        return ltAgentconfigMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(LtAgentconfig record) {
        return ltAgentconfigMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(LtAgentconfig record) {
        return ltAgentconfigMapper.updateByPrimaryKey(record);
    }

}

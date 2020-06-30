package com.wswl.waterbridge.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.wswl.waterbridge.mapper.LtAwardconfigMapper;
import com.wswl.waterbridge.dto.LtAwardconfig;
import com.wswl.waterbridge.service.LtAwardconfigService;
@Service
public class LtAwardconfigServiceImpl implements LtAwardconfigService{

    @Resource
    private LtAwardconfigMapper ltAwardconfigMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return ltAwardconfigMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(LtAwardconfig record) {
        return ltAwardconfigMapper.insert(record);
    }

    @Override
    public int insertSelective(LtAwardconfig record) {
        return ltAwardconfigMapper.insertSelective(record);
    }

    @Override
    public LtAwardconfig selectByPrimaryKey(Integer id) {
        return ltAwardconfigMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(LtAwardconfig record) {
        return ltAwardconfigMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(LtAwardconfig record) {
        return ltAwardconfigMapper.updateByPrimaryKey(record);
    }

}

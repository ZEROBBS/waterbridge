package com.wswl.waterbridge.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.wswl.waterbridge.mapper.LtDintroduceMapper;
import com.wswl.waterbridge.dto.LtDintroduce;
import com.wswl.waterbridge.service.LtDintroduceService;
@Service
public class LtDintroduceServiceImpl implements LtDintroduceService{

    @Resource
    private LtDintroduceMapper ltDintroduceMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return ltDintroduceMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(LtDintroduce record) {
        return ltDintroduceMapper.insert(record);
    }

    @Override
    public int insertSelective(LtDintroduce record) {
        return ltDintroduceMapper.insertSelective(record);
    }

    @Override
    public LtDintroduce selectByPrimaryKey(Integer id) {
        return ltDintroduceMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(LtDintroduce record) {
        return ltDintroduceMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(LtDintroduce record) {
        return ltDintroduceMapper.updateByPrimaryKey(record);
    }

}

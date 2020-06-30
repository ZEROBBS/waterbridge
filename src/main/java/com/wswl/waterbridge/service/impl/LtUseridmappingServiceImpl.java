package com.wswl.waterbridge.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.wswl.waterbridge.mapper.LtUseridmappingMapper;
import com.wswl.waterbridge.dto.LtUseridmapping;
import com.wswl.waterbridge.service.LtUseridmappingService;
@Service
public class LtUseridmappingServiceImpl implements LtUseridmappingService{

    @Resource
    private LtUseridmappingMapper ltUseridmappingMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return ltUseridmappingMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(LtUseridmapping record) {
        return ltUseridmappingMapper.insert(record);
    }

    @Override
    public int insertSelective(LtUseridmapping record) {
        return ltUseridmappingMapper.insertSelective(record);
    }

    @Override
    public LtUseridmapping selectByPrimaryKey(Integer id) {
        return ltUseridmappingMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(LtUseridmapping record) {
        return ltUseridmappingMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(LtUseridmapping record) {
        return ltUseridmappingMapper.updateByPrimaryKey(record);
    }

}

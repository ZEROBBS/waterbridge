package com.wswl.waterbridge.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.wswl.waterbridge.mapper.SysSmsFilterMapper;
import com.wswl.waterbridge.dto.SysSmsFilter;
import com.wswl.waterbridge.service.SysSmsFilterService;
@Service
public class SysSmsFilterServiceImpl implements SysSmsFilterService{

    @Resource
    private SysSmsFilterMapper sysSmsFilterMapper;

    @Override
    public int deleteByPrimaryKey(String fid) {
        return sysSmsFilterMapper.deleteByPrimaryKey(fid);
    }

    @Override
    public int insert(SysSmsFilter record) {
        return sysSmsFilterMapper.insert(record);
    }

    @Override
    public int insertSelective(SysSmsFilter record) {
        return sysSmsFilterMapper.insertSelective(record);
    }

    @Override
    public SysSmsFilter selectByPrimaryKey(String fid) {
        return sysSmsFilterMapper.selectByPrimaryKey(fid);
    }

    @Override
    public int updateByPrimaryKeySelective(SysSmsFilter record) {
        return sysSmsFilterMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SysSmsFilter record) {
        return sysSmsFilterMapper.updateByPrimaryKey(record);
    }

}

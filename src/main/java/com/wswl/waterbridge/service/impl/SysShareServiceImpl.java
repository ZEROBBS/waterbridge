package com.wswl.waterbridge.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.wswl.waterbridge.mapper.SysShareMapper;
import com.wswl.waterbridge.dto.SysShare;
import com.wswl.waterbridge.service.SysShareService;
@Service
public class SysShareServiceImpl implements SysShareService{

    @Resource
    private SysShareMapper sysShareMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return sysShareMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SysShare record) {
        return sysShareMapper.insert(record);
    }

    @Override
    public int insertSelective(SysShare record) {
        return sysShareMapper.insertSelective(record);
    }

    @Override
    public SysShare selectByPrimaryKey(String id) {
        return sysShareMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SysShare record) {
        return sysShareMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SysShare record) {
        return sysShareMapper.updateByPrimaryKey(record);
    }

}

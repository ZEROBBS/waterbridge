package com.wswl.waterbridge.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.wswl.waterbridge.mapper.SysAboutMapper;
import com.wswl.waterbridge.dto.SysAbout;
import com.wswl.waterbridge.service.SysAboutService;
@Service
public class SysAboutServiceImpl implements SysAboutService{

    @Resource
    private SysAboutMapper sysAboutMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return sysAboutMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SysAbout record) {
        return sysAboutMapper.insert(record);
    }

    @Override
    public int insertSelective(SysAbout record) {
        return sysAboutMapper.insertSelective(record);
    }

    @Override
    public SysAbout selectByPrimaryKey(String id) {
        return sysAboutMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SysAbout record) {
        return sysAboutMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SysAbout record) {
        return sysAboutMapper.updateByPrimaryKey(record);
    }

}

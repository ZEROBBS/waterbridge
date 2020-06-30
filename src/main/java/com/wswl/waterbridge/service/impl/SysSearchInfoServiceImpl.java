package com.wswl.waterbridge.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.wswl.waterbridge.dto.SysSearchInfo;
import com.wswl.waterbridge.mapper.SysSearchInfoMapper;
import com.wswl.waterbridge.service.SysSearchInfoService;
@Service
public class SysSearchInfoServiceImpl implements SysSearchInfoService{

    @Resource
    private SysSearchInfoMapper sysSearchInfoMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return sysSearchInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SysSearchInfo record) {
        return sysSearchInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(SysSearchInfo record) {
        return sysSearchInfoMapper.insertSelective(record);
    }

    @Override
    public SysSearchInfo selectByPrimaryKey(String id) {
        return sysSearchInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SysSearchInfo record) {
        return sysSearchInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SysSearchInfo record) {
        return sysSearchInfoMapper.updateByPrimaryKey(record);
    }

}

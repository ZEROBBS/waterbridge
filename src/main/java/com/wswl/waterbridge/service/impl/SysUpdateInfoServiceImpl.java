package com.wswl.waterbridge.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.wswl.waterbridge.mapper.SysUpdateInfoMapper;
import com.wswl.waterbridge.dto.SysUpdateInfo;
import com.wswl.waterbridge.service.SysUpdateInfoService;
@Service
public class SysUpdateInfoServiceImpl implements SysUpdateInfoService{

    @Resource
    private SysUpdateInfoMapper sysUpdateInfoMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return sysUpdateInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SysUpdateInfo record) {
        return sysUpdateInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(SysUpdateInfo record) {
        return sysUpdateInfoMapper.insertSelective(record);
    }

    @Override
    public SysUpdateInfo selectByPrimaryKey(String id) {
        return sysUpdateInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SysUpdateInfo record) {
        return sysUpdateInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SysUpdateInfo record) {
        return sysUpdateInfoMapper.updateByPrimaryKey(record);
    }

}

package com.wswl.waterbridge.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.wswl.waterbridge.mapper.SysAccountMapper;
import com.wswl.waterbridge.dto.SysAccount;
import com.wswl.waterbridge.service.SysAccountService;
@Service
public class SysAccountServiceImpl implements SysAccountService{

    @Resource
    private SysAccountMapper sysAccountMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return sysAccountMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SysAccount record) {
        return sysAccountMapper.insert(record);
    }

    @Override
    public int insertSelective(SysAccount record) {
        return sysAccountMapper.insertSelective(record);
    }

    @Override
    public SysAccount selectByPrimaryKey(String id) {
        return sysAccountMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SysAccount record) {
        return sysAccountMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SysAccount record) {
        return sysAccountMapper.updateByPrimaryKey(record);
    }

}

package com.wswl.waterbridge.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.wswl.waterbridge.mapper.SysLinkMapper;
import com.wswl.waterbridge.dto.SysLink;
import com.wswl.waterbridge.service.SysLinkService;
@Service
public class SysLinkServiceImpl implements SysLinkService{

    @Resource
    private SysLinkMapper sysLinkMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return sysLinkMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SysLink record) {
        return sysLinkMapper.insert(record);
    }

    @Override
    public int insertSelective(SysLink record) {
        return sysLinkMapper.insertSelective(record);
    }

    @Override
    public SysLink selectByPrimaryKey(String id) {
        return sysLinkMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SysLink record) {
        return sysLinkMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SysLink record) {
        return sysLinkMapper.updateByPrimaryKey(record);
    }

}

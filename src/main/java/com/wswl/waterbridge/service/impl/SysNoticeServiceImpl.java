package com.wswl.waterbridge.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.wswl.waterbridge.dto.SysNotice;
import com.wswl.waterbridge.mapper.SysNoticeMapper;
import com.wswl.waterbridge.service.SysNoticeService;
@Service
public class SysNoticeServiceImpl implements SysNoticeService{

    @Resource
    private SysNoticeMapper sysNoticeMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return sysNoticeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SysNotice record) {
        return sysNoticeMapper.insert(record);
    }

    @Override
    public int insertSelective(SysNotice record) {
        return sysNoticeMapper.insertSelective(record);
    }

    @Override
    public SysNotice selectByPrimaryKey(String id) {
        return sysNoticeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SysNotice record) {
        return sysNoticeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SysNotice record) {
        return sysNoticeMapper.updateByPrimaryKey(record);
    }

}

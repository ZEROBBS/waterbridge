package com.wswl.waterbridge.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.wswl.waterbridge.mapper.DAppPlatformMapper;
import com.wswl.waterbridge.dto.DAppPlatform;
import com.wswl.waterbridge.service.DAppPlatformService;
@Service
public class DAppPlatformServiceImpl implements DAppPlatformService{

    @Resource
    private DAppPlatformMapper dAppPlatformMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return dAppPlatformMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(DAppPlatform record) {
        return dAppPlatformMapper.insert(record);
    }

    @Override
    public int insertSelective(DAppPlatform record) {
        return dAppPlatformMapper.insertSelective(record);
    }

    @Override
    public DAppPlatform selectByPrimaryKey(String id) {
        return dAppPlatformMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(DAppPlatform record) {
        return dAppPlatformMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(DAppPlatform record) {
        return dAppPlatformMapper.updateByPrimaryKey(record);
    }

}

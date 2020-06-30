package com.wswl.waterbridge.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.wswl.waterbridge.mapper.DAppExtendMapper;
import com.wswl.waterbridge.dto.DAppExtend;
import com.wswl.waterbridge.service.DAppExtendService;
@Service
public class DAppExtendServiceImpl implements DAppExtendService{

    @Resource
    private DAppExtendMapper dAppExtendMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return dAppExtendMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(DAppExtend record) {
        return dAppExtendMapper.insert(record);
    }

    @Override
    public int insertSelective(DAppExtend record) {
        return dAppExtendMapper.insertSelective(record);
    }

    @Override
    public DAppExtend selectByPrimaryKey(Integer id) {
        return dAppExtendMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(DAppExtend record) {
        return dAppExtendMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(DAppExtend record) {
        return dAppExtendMapper.updateByPrimaryKey(record);
    }

}

package com.wswl.waterbridge.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.wswl.waterbridge.dto.LtCointype;
import com.wswl.waterbridge.mapper.LtCointypeMapper;
import com.wswl.waterbridge.service.LtCointypeService;
@Service
public class LtCointypeServiceImpl implements LtCointypeService{

    @Resource
    private LtCointypeMapper ltCointypeMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return ltCointypeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(LtCointype record) {
        return ltCointypeMapper.insert(record);
    }

    @Override
    public int insertSelective(LtCointype record) {
        return ltCointypeMapper.insertSelective(record);
    }

    @Override
    public LtCointype selectByPrimaryKey(Integer id) {
        return ltCointypeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(LtCointype record) {
        return ltCointypeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(LtCointype record) {
        return ltCointypeMapper.updateByPrimaryKey(record);
    }

}

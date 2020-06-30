package com.wswl.waterbridge.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.wswl.waterbridge.dto.LtAddress;
import com.wswl.waterbridge.mapper.LtAddressMapper;
import com.wswl.waterbridge.service.LtAddressService;
@Service
public class LtAddressServiceImpl implements LtAddressService{

    @Resource
    private LtAddressMapper ltAddressMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return ltAddressMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(LtAddress record) {
        return ltAddressMapper.insert(record);
    }

    @Override
    public int insertSelective(LtAddress record) {
        return ltAddressMapper.insertSelective(record);
    }

    @Override
    public LtAddress selectByPrimaryKey(Integer id) {
        return ltAddressMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(LtAddress record) {
        return ltAddressMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(LtAddress record) {
        return ltAddressMapper.updateByPrimaryKey(record);
    }

}

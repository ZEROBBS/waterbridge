package com.wswl.waterbridge.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.wswl.waterbridge.mapper.LtTranferMapper;
import com.wswl.waterbridge.dto.LtTranfer;
import com.wswl.waterbridge.service.LtTranferService;
@Service
public class LtTranferServiceImpl implements LtTranferService{

    @Resource
    private LtTranferMapper ltTranferMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return ltTranferMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(LtTranfer record) {
        return ltTranferMapper.insert(record);
    }

    @Override
    public int insertSelective(LtTranfer record) {
        return ltTranferMapper.insertSelective(record);
    }

    @Override
    public LtTranfer selectByPrimaryKey(Integer id) {
        return ltTranferMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(LtTranfer record) {
        return ltTranferMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(LtTranfer record) {
        return ltTranferMapper.updateByPrimaryKey(record);
    }

}

package com.wswl.waterbridge.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.wswl.waterbridge.mapper.LtUserconsumeMapper;
import com.wswl.waterbridge.dto.LtUserconsume;
import com.wswl.waterbridge.service.LtUserconsumeService;
@Service
public class LtUserconsumeServiceImpl implements LtUserconsumeService{

    @Resource
    private LtUserconsumeMapper ltUserconsumeMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return ltUserconsumeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(LtUserconsume record) {
        return ltUserconsumeMapper.insert(record);
    }

    @Override
    public int insertSelective(LtUserconsume record) {
        return ltUserconsumeMapper.insertSelective(record);
    }

    @Override
    public LtUserconsume selectByPrimaryKey(Integer id) {
        return ltUserconsumeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(LtUserconsume record) {
        return ltUserconsumeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(LtUserconsume record) {
        return ltUserconsumeMapper.updateByPrimaryKey(record);
    }

}

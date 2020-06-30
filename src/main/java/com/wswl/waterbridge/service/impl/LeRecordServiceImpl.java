package com.wswl.waterbridge.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.wswl.waterbridge.mapper.LeRecordMapper;
import com.wswl.waterbridge.dto.LeRecord;
import com.wswl.waterbridge.service.LeRecordService;
@Service
public class LeRecordServiceImpl implements LeRecordService{

    @Resource
    private LeRecordMapper leRecordMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return leRecordMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(LeRecord record) {
        return leRecordMapper.insert(record);
    }

    @Override
    public int insertSelective(LeRecord record) {
        return leRecordMapper.insertSelective(record);
    }

    @Override
    public LeRecord selectByPrimaryKey(Integer id) {
        return leRecordMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(LeRecord record) {
        return leRecordMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(LeRecord record) {
        return leRecordMapper.updateByPrimaryKey(record);
    }

}

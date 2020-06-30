package com.wswl.waterbridge.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.wswl.waterbridge.mapper.LogPayRecordMapper;
import com.wswl.waterbridge.dto.LogPayRecord;
import com.wswl.waterbridge.service.LogPayRecordService;
@Service
public class LogPayRecordServiceImpl implements LogPayRecordService{

    @Resource
    private LogPayRecordMapper logPayRecordMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return logPayRecordMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(LogPayRecord record) {
        return logPayRecordMapper.insert(record);
    }

    @Override
    public int insertSelective(LogPayRecord record) {
        return logPayRecordMapper.insertSelective(record);
    }

    @Override
    public LogPayRecord selectByPrimaryKey(String id) {
        return logPayRecordMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(LogPayRecord record) {
        return logPayRecordMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(LogPayRecord record) {
        return logPayRecordMapper.updateByPrimaryKey(record);
    }

}

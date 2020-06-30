package com.wswl.waterbridge.service;

import com.wswl.waterbridge.mapper.LogPayRecordMapper;
import com.wswl.waterbridge.dto.LogPayRecord;
public interface LogPayRecordService{


    int deleteByPrimaryKey(String id);

    int insert(LogPayRecord record);

    int insertSelective(LogPayRecord record);

    LogPayRecord selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(LogPayRecord record);

    int updateByPrimaryKey(LogPayRecord record);

}

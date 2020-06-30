package com.wswl.waterbridge.mapper;

import com.wswl.waterbridge.dto.LogPayRecord;

public interface LogPayRecordMapper {
    int deleteByPrimaryKey(String id);

    int insert(LogPayRecord record);

    int insertSelective(LogPayRecord record);

    LogPayRecord selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(LogPayRecord record);

    int updateByPrimaryKey(LogPayRecord record);
}
package com.wswl.waterbridge.mapper;

import com.wswl.waterbridge.dto.LeRecord;

public interface LeRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LeRecord record);

    int insertSelective(LeRecord record);

    LeRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LeRecord record);

    int updateByPrimaryKey(LeRecord record);
}
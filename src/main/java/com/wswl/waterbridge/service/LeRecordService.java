package com.wswl.waterbridge.service;

import com.wswl.waterbridge.mapper.LeRecordMapper;
import com.wswl.waterbridge.dto.LeRecord;
public interface LeRecordService{


    int deleteByPrimaryKey(Integer id);

    int insert(LeRecord record);

    int insertSelective(LeRecord record);

    LeRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LeRecord record);

    int updateByPrimaryKey(LeRecord record);

}

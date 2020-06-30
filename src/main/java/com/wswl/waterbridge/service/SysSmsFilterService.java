package com.wswl.waterbridge.service;

import com.wswl.waterbridge.mapper.SysSmsFilterMapper;
import com.wswl.waterbridge.dto.SysSmsFilter;
public interface SysSmsFilterService{


    int deleteByPrimaryKey(String fid);

    int insert(SysSmsFilter record);

    int insertSelective(SysSmsFilter record);

    SysSmsFilter selectByPrimaryKey(String fid);

    int updateByPrimaryKeySelective(SysSmsFilter record);

    int updateByPrimaryKey(SysSmsFilter record);

}

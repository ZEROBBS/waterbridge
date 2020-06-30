package com.wswl.waterbridge.mapper;

import com.wswl.waterbridge.dto.SysSmsFilter;

public interface SysSmsFilterMapper {
    int deleteByPrimaryKey(String fid);

    int insert(SysSmsFilter record);

    int insertSelective(SysSmsFilter record);

    SysSmsFilter selectByPrimaryKey(String fid);

    int updateByPrimaryKeySelective(SysSmsFilter record);

    int updateByPrimaryKey(SysSmsFilter record);
}
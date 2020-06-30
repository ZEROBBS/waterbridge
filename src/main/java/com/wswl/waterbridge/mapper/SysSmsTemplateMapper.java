package com.wswl.waterbridge.mapper;

import com.wswl.waterbridge.dto.SysSmsTemplate;

public interface SysSmsTemplateMapper {
    int deleteByPrimaryKey(String id);

    int insert(SysSmsTemplate record);

    int insertSelective(SysSmsTemplate record);

    SysSmsTemplate selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysSmsTemplate record);

    int updateByPrimaryKey(SysSmsTemplate record);
}
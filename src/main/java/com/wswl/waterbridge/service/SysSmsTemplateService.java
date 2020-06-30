package com.wswl.waterbridge.service;

import com.wswl.waterbridge.mapper.SysSmsTemplateMapper;
import com.wswl.waterbridge.dto.SysSmsTemplate;
public interface SysSmsTemplateService{


    int deleteByPrimaryKey(String id);

    int insert(SysSmsTemplate record);

    int insertSelective(SysSmsTemplate record);

    SysSmsTemplate selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysSmsTemplate record);

    int updateByPrimaryKey(SysSmsTemplate record);

}

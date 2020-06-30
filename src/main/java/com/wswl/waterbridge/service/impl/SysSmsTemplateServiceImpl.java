package com.wswl.waterbridge.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.wswl.waterbridge.mapper.SysSmsTemplateMapper;
import com.wswl.waterbridge.dto.SysSmsTemplate;
import com.wswl.waterbridge.service.SysSmsTemplateService;
@Service
public class SysSmsTemplateServiceImpl implements SysSmsTemplateService{

    @Resource
    private SysSmsTemplateMapper sysSmsTemplateMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return sysSmsTemplateMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SysSmsTemplate record) {
        return sysSmsTemplateMapper.insert(record);
    }

    @Override
    public int insertSelective(SysSmsTemplate record) {
        return sysSmsTemplateMapper.insertSelective(record);
    }

    @Override
    public SysSmsTemplate selectByPrimaryKey(String id) {
        return sysSmsTemplateMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SysSmsTemplate record) {
        return sysSmsTemplateMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SysSmsTemplate record) {
        return sysSmsTemplateMapper.updateByPrimaryKey(record);
    }

}

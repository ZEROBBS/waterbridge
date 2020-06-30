package com.wswl.waterbridge.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.wswl.waterbridge.mapper.LeAddpledgeMapper;
import com.wswl.waterbridge.dto.LeAddpledge;
import com.wswl.waterbridge.service.LeAddpledgeService;
@Service
public class LeAddpledgeServiceImpl implements LeAddpledgeService{

    @Resource
    private LeAddpledgeMapper leAddpledgeMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return leAddpledgeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(LeAddpledge record) {
        return leAddpledgeMapper.insert(record);
    }

    @Override
    public int insertSelective(LeAddpledge record) {
        return leAddpledgeMapper.insertSelective(record);
    }

    @Override
    public LeAddpledge selectByPrimaryKey(Integer id) {
        return leAddpledgeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(LeAddpledge record) {
        return leAddpledgeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(LeAddpledge record) {
        return leAddpledgeMapper.updateByPrimaryKey(record);
    }

}

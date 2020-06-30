package com.wswl.waterbridge.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.wswl.waterbridge.dto.LeProduct;
import com.wswl.waterbridge.mapper.LeProductMapper;
import com.wswl.waterbridge.service.LeProductService;
@Service
public class LeProductServiceImpl implements LeProductService{

    @Resource
    private LeProductMapper leProductMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return leProductMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(LeProduct record) {
        return leProductMapper.insert(record);
    }

    @Override
    public int insertSelective(LeProduct record) {
        return leProductMapper.insertSelective(record);
    }

    @Override
    public LeProduct selectByPrimaryKey(Integer id) {
        return leProductMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(LeProduct record) {
        return leProductMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(LeProduct record) {
        return leProductMapper.updateByPrimaryKey(record);
    }

}

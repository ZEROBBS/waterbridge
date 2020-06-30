package com.wswl.waterbridge.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.wswl.waterbridge.dto.LtDcategory;
import com.wswl.waterbridge.mapper.LtDcategoryMapper;
import com.wswl.waterbridge.service.LtDcategoryService;
@Service
public class LtDcategoryServiceImpl implements LtDcategoryService{

    @Resource
    private LtDcategoryMapper ltDcategoryMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return ltDcategoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(LtDcategory record) {
        return ltDcategoryMapper.insert(record);
    }

    @Override
    public int insertSelective(LtDcategory record) {
        return ltDcategoryMapper.insertSelective(record);
    }

    @Override
    public LtDcategory selectByPrimaryKey(Integer id) {
        return ltDcategoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(LtDcategory record) {
        return ltDcategoryMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(LtDcategory record) {
        return ltDcategoryMapper.updateByPrimaryKey(record);
    }

}

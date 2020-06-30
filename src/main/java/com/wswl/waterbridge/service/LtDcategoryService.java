package com.wswl.waterbridge.service;

import com.wswl.waterbridge.dto.LtDcategory;
import com.wswl.waterbridge.mapper.LtDcategoryMapper;
public interface LtDcategoryService{


    int deleteByPrimaryKey(Integer id);

    int insert(LtDcategory record);

    int insertSelective(LtDcategory record);

    LtDcategory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LtDcategory record);

    int updateByPrimaryKey(LtDcategory record);

}

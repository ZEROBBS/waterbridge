package com.wswl.waterbridge.mapper;

import com.wswl.waterbridge.dto.LtDcategory;

public interface LtDcategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LtDcategory record);

    int insertSelective(LtDcategory record);

    LtDcategory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LtDcategory record);

    int updateByPrimaryKey(LtDcategory record);
}
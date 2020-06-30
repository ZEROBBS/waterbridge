package com.wswl.waterbridge.mapper;

import com.wswl.waterbridge.dto.LeProduct;

public interface LeProductMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LeProduct record);

    int insertSelective(LeProduct record);

    LeProduct selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LeProduct record);

    int updateByPrimaryKey(LeProduct record);
}
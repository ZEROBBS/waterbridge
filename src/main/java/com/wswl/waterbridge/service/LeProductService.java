package com.wswl.waterbridge.service;

import com.wswl.waterbridge.dto.LeProduct;
import com.wswl.waterbridge.mapper.LeProductMapper;
public interface LeProductService{


    int deleteByPrimaryKey(Integer id);

    int insert(LeProduct record);

    int insertSelective(LeProduct record);

    LeProduct selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LeProduct record);

    int updateByPrimaryKey(LeProduct record);

}

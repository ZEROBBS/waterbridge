package com.wswl.waterbridge.service;

import com.wswl.waterbridge.mapper.LtUseridmappingMapper;
import com.wswl.waterbridge.dto.LtUseridmapping;
public interface LtUseridmappingService{


    int deleteByPrimaryKey(Integer id);

    int insert(LtUseridmapping record);

    int insertSelective(LtUseridmapping record);

    LtUseridmapping selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LtUseridmapping record);

    int updateByPrimaryKey(LtUseridmapping record);

}

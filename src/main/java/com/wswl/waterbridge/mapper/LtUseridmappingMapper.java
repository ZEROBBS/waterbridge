package com.wswl.waterbridge.mapper;

import com.wswl.waterbridge.dto.LtUseridmapping;

public interface LtUseridmappingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LtUseridmapping record);

    int insertSelective(LtUseridmapping record);

    LtUseridmapping selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LtUseridmapping record);

    int updateByPrimaryKey(LtUseridmapping record);
}
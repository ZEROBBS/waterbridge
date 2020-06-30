package com.wswl.waterbridge.mapper;

import com.wswl.waterbridge.dto.LtAgentconfig;

public interface LtAgentconfigMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LtAgentconfig record);

    int insertSelective(LtAgentconfig record);

    LtAgentconfig selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LtAgentconfig record);

    int updateByPrimaryKey(LtAgentconfig record);
}
package com.wswl.waterbridge.service;

import com.wswl.waterbridge.mapper.LtAgentconfigMapper;
import com.wswl.waterbridge.dto.LtAgentconfig;
public interface LtAgentconfigService{


    int deleteByPrimaryKey(Integer id);

    int insert(LtAgentconfig record);

    int insertSelective(LtAgentconfig record);

    LtAgentconfig selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LtAgentconfig record);

    int updateByPrimaryKey(LtAgentconfig record);

}

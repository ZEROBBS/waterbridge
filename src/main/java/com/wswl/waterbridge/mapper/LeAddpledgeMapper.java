package com.wswl.waterbridge.mapper;

import com.wswl.waterbridge.dto.LeAddpledge;

public interface LeAddpledgeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LeAddpledge record);

    int insertSelective(LeAddpledge record);

    LeAddpledge selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LeAddpledge record);

    int updateByPrimaryKey(LeAddpledge record);
}
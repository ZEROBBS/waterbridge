package com.wswl.waterbridge.service;

import com.wswl.waterbridge.mapper.LeAddpledgeMapper;
import com.wswl.waterbridge.dto.LeAddpledge;
public interface LeAddpledgeService{


    int deleteByPrimaryKey(Integer id);

    int insert(LeAddpledge record);

    int insertSelective(LeAddpledge record);

    LeAddpledge selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LeAddpledge record);

    int updateByPrimaryKey(LeAddpledge record);

}

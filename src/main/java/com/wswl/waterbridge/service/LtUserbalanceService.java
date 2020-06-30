package com.wswl.waterbridge.service;

import com.wswl.waterbridge.mapper.LtUserbalanceMapper;
import com.wswl.waterbridge.dto.LtUserbalance;
public interface LtUserbalanceService{


    int deleteByPrimaryKey(Integer uid);

    int insert(LtUserbalance record);

    int insertSelective(LtUserbalance record);

    LtUserbalance selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(LtUserbalance record);

    int updateByPrimaryKey(LtUserbalance record);

}

package com.wswl.waterbridge.mapper;

import com.wswl.waterbridge.dto.LtUserbalance;

public interface LtUserbalanceMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(LtUserbalance record);

    int insertSelective(LtUserbalance record);

    LtUserbalance selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(LtUserbalance record);

    int updateByPrimaryKey(LtUserbalance record);
}
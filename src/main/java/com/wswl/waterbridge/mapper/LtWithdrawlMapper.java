package com.wswl.waterbridge.mapper;

import com.wswl.waterbridge.dto.LtWithdrawl;

public interface LtWithdrawlMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LtWithdrawl record);

    int insertSelective(LtWithdrawl record);

    LtWithdrawl selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LtWithdrawl record);

    int updateByPrimaryKey(LtWithdrawl record);
}
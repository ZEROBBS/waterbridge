package com.wswl.waterbridge.mapper;

import com.wswl.waterbridge.dto.LtWithdrawlcoin;

public interface LtWithdrawlcoinMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LtWithdrawlcoin record);

    int insertSelective(LtWithdrawlcoin record);

    LtWithdrawlcoin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LtWithdrawlcoin record);

    int updateByPrimaryKey(LtWithdrawlcoin record);
}
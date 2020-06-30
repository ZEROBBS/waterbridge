package com.wswl.waterbridge.service;

import com.wswl.waterbridge.mapper.LtWithdrawlcoinMapper;
import com.wswl.waterbridge.dto.LtWithdrawlcoin;
public interface LtWithdrawlcoinService{


    int deleteByPrimaryKey(Integer id);

    int insert(LtWithdrawlcoin record);

    int insertSelective(LtWithdrawlcoin record);

    LtWithdrawlcoin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LtWithdrawlcoin record);

    int updateByPrimaryKey(LtWithdrawlcoin record);

}

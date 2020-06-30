package com.wswl.waterbridge.service;

import com.wswl.waterbridge.mapper.LtWithdrawlMapper;
import com.wswl.waterbridge.dto.LtWithdrawl;
public interface LtWithdrawlService{


    int deleteByPrimaryKey(Integer id);

    int insert(LtWithdrawl record);

    int insertSelective(LtWithdrawl record);

    LtWithdrawl selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LtWithdrawl record);

    int updateByPrimaryKey(LtWithdrawl record);

}

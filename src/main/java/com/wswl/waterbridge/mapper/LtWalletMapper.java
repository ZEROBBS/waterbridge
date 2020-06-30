package com.wswl.waterbridge.mapper;

import com.wswl.waterbridge.dto.LtWallet;

public interface LtWalletMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(LtWallet record);

    int insertSelective(LtWallet record);

    LtWallet selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(LtWallet record);

    int updateByPrimaryKey(LtWallet record);
}
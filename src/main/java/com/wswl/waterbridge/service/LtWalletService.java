package com.wswl.waterbridge.service;

import com.wswl.waterbridge.mapper.LtWalletMapper;
import com.wswl.waterbridge.dto.LtWallet;
public interface LtWalletService{


    int deleteByPrimaryKey(Integer uid);

    int insert(LtWallet record);

    int insertSelective(LtWallet record);

    LtWallet selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(LtWallet record);

    int updateByPrimaryKey(LtWallet record);

}

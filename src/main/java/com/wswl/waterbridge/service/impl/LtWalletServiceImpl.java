package com.wswl.waterbridge.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.wswl.waterbridge.mapper.LtWalletMapper;
import com.wswl.waterbridge.dto.LtWallet;
import com.wswl.waterbridge.service.LtWalletService;
@Service
public class LtWalletServiceImpl implements LtWalletService{

    @Resource
    private LtWalletMapper ltWalletMapper;

    @Override
    public int deleteByPrimaryKey(Integer uid) {
        return ltWalletMapper.deleteByPrimaryKey(uid);
    }

    @Override
    public int insert(LtWallet record) {
        return ltWalletMapper.insert(record);
    }

    @Override
    public int insertSelective(LtWallet record) {
        return ltWalletMapper.insertSelective(record);
    }

    @Override
    public LtWallet selectByPrimaryKey(Integer uid) {
        return ltWalletMapper.selectByPrimaryKey(uid);
    }

    @Override
    public int updateByPrimaryKeySelective(LtWallet record) {
        return ltWalletMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(LtWallet record) {
        return ltWalletMapper.updateByPrimaryKey(record);
    }

}

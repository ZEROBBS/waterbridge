package com.wswl.waterbridge.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.wswl.waterbridge.mapper.LtWithdrawlcoinMapper;
import com.wswl.waterbridge.dto.LtWithdrawlcoin;
import com.wswl.waterbridge.service.LtWithdrawlcoinService;
@Service
public class LtWithdrawlcoinServiceImpl implements LtWithdrawlcoinService{

    @Resource
    private LtWithdrawlcoinMapper ltWithdrawlcoinMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return ltWithdrawlcoinMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(LtWithdrawlcoin record) {
        return ltWithdrawlcoinMapper.insert(record);
    }

    @Override
    public int insertSelective(LtWithdrawlcoin record) {
        return ltWithdrawlcoinMapper.insertSelective(record);
    }

    @Override
    public LtWithdrawlcoin selectByPrimaryKey(Integer id) {
        return ltWithdrawlcoinMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(LtWithdrawlcoin record) {
        return ltWithdrawlcoinMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(LtWithdrawlcoin record) {
        return ltWithdrawlcoinMapper.updateByPrimaryKey(record);
    }

}

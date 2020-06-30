package com.wswl.waterbridge.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.wswl.waterbridge.mapper.LtWithdrawlMapper;
import com.wswl.waterbridge.dto.LtWithdrawl;
import com.wswl.waterbridge.service.LtWithdrawlService;
@Service
public class LtWithdrawlServiceImpl implements LtWithdrawlService{

    @Resource
    private LtWithdrawlMapper ltWithdrawlMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return ltWithdrawlMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(LtWithdrawl record) {
        return ltWithdrawlMapper.insert(record);
    }

    @Override
    public int insertSelective(LtWithdrawl record) {
        return ltWithdrawlMapper.insertSelective(record);
    }

    @Override
    public LtWithdrawl selectByPrimaryKey(Integer id) {
        return ltWithdrawlMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(LtWithdrawl record) {
        return ltWithdrawlMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(LtWithdrawl record) {
        return ltWithdrawlMapper.updateByPrimaryKey(record);
    }

}

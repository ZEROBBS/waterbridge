package com.wswl.waterbridge.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.wswl.waterbridge.mapper.LtUserlevelMapper;
import com.wswl.waterbridge.dto.LtUserlevel;
import com.wswl.waterbridge.service.LtUserlevelService;
@Service
public class LtUserlevelServiceImpl implements LtUserlevelService{

    @Resource
    private LtUserlevelMapper ltUserlevelMapper;

    @Override
    public int deleteByPrimaryKey(Integer uid) {
        return ltUserlevelMapper.deleteByPrimaryKey(uid);
    }

    @Override
    public int insert(LtUserlevel record) {
        return ltUserlevelMapper.insert(record);
    }

    @Override
    public int insertSelective(LtUserlevel record) {
        return ltUserlevelMapper.insertSelective(record);
    }

    @Override
    public LtUserlevel selectByPrimaryKey(Integer uid) {
        return ltUserlevelMapper.selectByPrimaryKey(uid);
    }

    @Override
    public int updateByPrimaryKeySelective(LtUserlevel record) {
        return ltUserlevelMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(LtUserlevel record) {
        return ltUserlevelMapper.updateByPrimaryKey(record);
    }

}

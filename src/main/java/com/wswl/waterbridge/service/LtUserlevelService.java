package com.wswl.waterbridge.service;

import com.wswl.waterbridge.mapper.LtUserlevelMapper;
import com.wswl.waterbridge.dto.LtUserlevel;
public interface LtUserlevelService{


    int deleteByPrimaryKey(Integer uid);

    int insert(LtUserlevel record);

    int insertSelective(LtUserlevel record);

    LtUserlevel selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(LtUserlevel record);

    int updateByPrimaryKey(LtUserlevel record);

}

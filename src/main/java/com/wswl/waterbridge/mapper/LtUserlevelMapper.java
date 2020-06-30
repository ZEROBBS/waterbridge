package com.wswl.waterbridge.mapper;

import com.wswl.waterbridge.dto.LtUserlevel;

public interface LtUserlevelMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(LtUserlevel record);

    int insertSelective(LtUserlevel record);

    LtUserlevel selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(LtUserlevel record);

    int updateByPrimaryKey(LtUserlevel record);
}
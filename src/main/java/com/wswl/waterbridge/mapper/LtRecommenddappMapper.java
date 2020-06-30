package com.wswl.waterbridge.mapper;

import com.wswl.waterbridge.dto.LtRecommenddapp;

public interface LtRecommenddappMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LtRecommenddapp record);

    int insertSelective(LtRecommenddapp record);

    LtRecommenddapp selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LtRecommenddapp record);

    int updateByPrimaryKey(LtRecommenddapp record);
}
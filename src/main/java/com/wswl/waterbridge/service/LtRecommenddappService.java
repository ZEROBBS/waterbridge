package com.wswl.waterbridge.service;

import com.wswl.waterbridge.dto.LtRecommenddapp;
import com.wswl.waterbridge.mapper.LtRecommenddappMapper;
public interface LtRecommenddappService{


    int deleteByPrimaryKey(Integer id);

    int insert(LtRecommenddapp record);

    int insertSelective(LtRecommenddapp record);

    LtRecommenddapp selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LtRecommenddapp record);

    int updateByPrimaryKey(LtRecommenddapp record);

}

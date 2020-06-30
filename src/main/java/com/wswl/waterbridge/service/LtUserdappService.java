package com.wswl.waterbridge.service;

import com.wswl.waterbridge.dto.LtUserdapp;
import com.wswl.waterbridge.mapper.LtUserdappMapper;
public interface LtUserdappService{


    int deleteByPrimaryKey(Integer id);

    int insert(LtUserdapp record);

    int insertSelective(LtUserdapp record);

    LtUserdapp selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LtUserdapp record);

    int updateByPrimaryKey(LtUserdapp record);

}

package com.wswl.waterbridge.service;

import com.wswl.waterbridge.mapper.LtDappMapper;
import com.wswl.waterbridge.dto.LtDapp;
public interface LtDappService{


    int deleteByPrimaryKey(Integer id);

    int insert(LtDapp record);

    int insertSelective(LtDapp record);

    LtDapp selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LtDapp record);

    int updateByPrimaryKey(LtDapp record);

}

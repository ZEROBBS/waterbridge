package com.wswl.waterbridge.mapper;

import com.wswl.waterbridge.dto.LtUserdapp;

public interface LtUserdappMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LtUserdapp record);

    int insertSelective(LtUserdapp record);

    LtUserdapp selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LtUserdapp record);

    int updateByPrimaryKey(LtUserdapp record);
}
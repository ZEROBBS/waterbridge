package com.wswl.waterbridge.mapper;

import com.wswl.waterbridge.dto.LtDapp;

public interface LtDappMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LtDapp record);

    int insertSelective(LtDapp record);

    LtDapp selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LtDapp record);

    int updateByPrimaryKey(LtDapp record);
}
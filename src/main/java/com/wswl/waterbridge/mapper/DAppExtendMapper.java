package com.wswl.waterbridge.mapper;

import com.wswl.waterbridge.dto.DAppExtend;

public interface DAppExtendMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DAppExtend record);

    int insertSelective(DAppExtend record);

    DAppExtend selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DAppExtend record);

    int updateByPrimaryKey(DAppExtend record);
}
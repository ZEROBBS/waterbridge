package com.wswl.waterbridge.mapper;

import com.wswl.waterbridge.dto.LtAwardconfig;

public interface LtAwardconfigMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LtAwardconfig record);

    int insertSelective(LtAwardconfig record);

    LtAwardconfig selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LtAwardconfig record);

    int updateByPrimaryKey(LtAwardconfig record);
}
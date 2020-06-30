package com.wswl.waterbridge.mapper;

import com.wswl.waterbridge.dto.LtUserextend;

public interface LtUserextendMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(LtUserextend record);

    int insertSelective(LtUserextend record);

    LtUserextend selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(LtUserextend record);

    int updateByPrimaryKey(LtUserextend record);
}
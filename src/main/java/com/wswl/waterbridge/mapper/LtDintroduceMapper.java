package com.wswl.waterbridge.mapper;

import com.wswl.waterbridge.dto.LtDintroduce;

public interface LtDintroduceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LtDintroduce record);

    int insertSelective(LtDintroduce record);

    LtDintroduce selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LtDintroduce record);

    int updateByPrimaryKey(LtDintroduce record);
}
package com.wswl.waterbridge.service;

import com.wswl.waterbridge.mapper.LtDintroduceMapper;
import com.wswl.waterbridge.dto.LtDintroduce;
public interface LtDintroduceService{


    int deleteByPrimaryKey(Integer id);

    int insert(LtDintroduce record);

    int insertSelective(LtDintroduce record);

    LtDintroduce selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LtDintroduce record);

    int updateByPrimaryKey(LtDintroduce record);

}

package com.wswl.waterbridge.service;

import com.wswl.waterbridge.mapper.LtLevelextendMapper;
import com.wswl.waterbridge.dto.LtLevelextend;
public interface LtLevelextendService{


    int deleteByPrimaryKey(Integer id);

    int insert(LtLevelextend record);

    int insertSelective(LtLevelextend record);

    LtLevelextend selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LtLevelextend record);

    int updateByPrimaryKey(LtLevelextend record);

}

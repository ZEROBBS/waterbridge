package com.wswl.waterbridge.mapper;

import com.wswl.waterbridge.dto.LtLevelextend;

import java.util.List;
import java.util.Map;

public interface LtLevelextendMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LtLevelextend record);

    int insertSelective(LtLevelextend record);

    LtLevelextend selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LtLevelextend record);

    int updateByPrimaryKey(LtLevelextend record);


    List<LtLevelextend> selectLevelList(Map<String,Object> paramMap);
}
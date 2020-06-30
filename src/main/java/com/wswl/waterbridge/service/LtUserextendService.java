package com.wswl.waterbridge.service;

import com.wswl.waterbridge.dto.LtUserextend;
import com.wswl.waterbridge.mapper.LtUserextendMapper;
public interface LtUserextendService{


    int deleteByPrimaryKey(Integer uid);

    int insert(LtUserextend record);

    int insertSelective(LtUserextend record);

    LtUserextend selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(LtUserextend record);

    int updateByPrimaryKey(LtUserextend record);

}

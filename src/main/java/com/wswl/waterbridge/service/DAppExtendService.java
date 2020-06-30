package com.wswl.waterbridge.service;

import com.wswl.waterbridge.mapper.DAppExtendMapper;
import com.wswl.waterbridge.dto.DAppExtend;
public interface DAppExtendService{


    int deleteByPrimaryKey(Integer id);

    int insert(DAppExtend record);

    int insertSelective(DAppExtend record);

    DAppExtend selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DAppExtend record);

    int updateByPrimaryKey(DAppExtend record);

}

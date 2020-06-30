package com.wswl.waterbridge.service;

import com.wswl.waterbridge.mapper.LtAwardconfigMapper;
import com.wswl.waterbridge.dto.LtAwardconfig;
public interface LtAwardconfigService{


    int deleteByPrimaryKey(Integer id);

    int insert(LtAwardconfig record);

    int insertSelective(LtAwardconfig record);

    LtAwardconfig selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LtAwardconfig record);

    int updateByPrimaryKey(LtAwardconfig record);

}

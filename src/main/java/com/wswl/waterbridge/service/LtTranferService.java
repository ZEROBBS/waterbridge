package com.wswl.waterbridge.service;

import com.wswl.waterbridge.mapper.LtTranferMapper;
import com.wswl.waterbridge.dto.LtTranfer;
public interface LtTranferService{


    int deleteByPrimaryKey(Integer id);

    int insert(LtTranfer record);

    int insertSelective(LtTranfer record);

    LtTranfer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LtTranfer record);

    int updateByPrimaryKey(LtTranfer record);

}

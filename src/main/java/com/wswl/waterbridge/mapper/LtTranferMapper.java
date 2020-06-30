package com.wswl.waterbridge.mapper;

import com.wswl.waterbridge.dto.LtTranfer;

public interface LtTranferMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LtTranfer record);

    int insertSelective(LtTranfer record);

    LtTranfer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LtTranfer record);

    int updateByPrimaryKey(LtTranfer record);
}
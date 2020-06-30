package com.wswl.waterbridge.mapper;

import com.wswl.waterbridge.dto.LtUserconsume;

public interface LtUserconsumeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LtUserconsume record);

    int insertSelective(LtUserconsume record);

    LtUserconsume selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LtUserconsume record);

    int updateByPrimaryKey(LtUserconsume record);
}
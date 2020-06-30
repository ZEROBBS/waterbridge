package com.wswl.waterbridge.service;

import com.wswl.waterbridge.mapper.LtUserconsumeMapper;
import com.wswl.waterbridge.dto.LtUserconsume;
public interface LtUserconsumeService{


    int deleteByPrimaryKey(Integer id);

    int insert(LtUserconsume record);

    int insertSelective(LtUserconsume record);

    LtUserconsume selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LtUserconsume record);

    int updateByPrimaryKey(LtUserconsume record);

}

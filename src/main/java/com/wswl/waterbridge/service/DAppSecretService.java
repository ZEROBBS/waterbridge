package com.wswl.waterbridge.service;

import com.wswl.waterbridge.dto.DAppSecret;
import com.wswl.waterbridge.mapper.DAppSecretMapper;
public interface DAppSecretService{


    int deleteByPrimaryKey(String id);

    int insert(DAppSecret record);

    int insertSelective(DAppSecret record);

    DAppSecret selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(DAppSecret record);

    int updateByPrimaryKey(DAppSecret record);

}

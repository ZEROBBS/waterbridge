package com.wswl.waterbridge.mapper;

import com.wswl.waterbridge.dto.DAppSecret;

public interface DAppSecretMapper {
    int deleteByPrimaryKey(String id);

    int insert(DAppSecret record);

    int insertSelective(DAppSecret record);

    DAppSecret selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(DAppSecret record);

    int updateByPrimaryKey(DAppSecret record);
}
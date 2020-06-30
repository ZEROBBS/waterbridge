package com.wswl.waterbridge.mapper;

import com.wswl.waterbridge.dto.LtAsset;

public interface LtAssetMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LtAsset record);

    int insertSelective(LtAsset record);

    LtAsset selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LtAsset record);

    int updateByPrimaryKey(LtAsset record);
}
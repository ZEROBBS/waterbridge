package com.wswl.waterbridge.mapper;

import com.wswl.waterbridge.dto.LtAssetprice;

public interface LtAssetpriceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LtAssetprice record);

    int insertSelective(LtAssetprice record);

    LtAssetprice selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LtAssetprice record);

    int updateByPrimaryKey(LtAssetprice record);
}
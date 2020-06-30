package com.wswl.waterbridge.service;

import com.wswl.waterbridge.mapper.LtAssetpriceMapper;
import com.wswl.waterbridge.dto.LtAssetprice;
public interface LtAssetpriceService{


    int deleteByPrimaryKey(Integer id);

    int insert(LtAssetprice record);

    int insertSelective(LtAssetprice record);

    LtAssetprice selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LtAssetprice record);

    int updateByPrimaryKey(LtAssetprice record);

}

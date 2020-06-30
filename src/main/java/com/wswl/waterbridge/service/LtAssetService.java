package com.wswl.waterbridge.service;

import com.wswl.waterbridge.mapper.LtAssetMapper;
import com.wswl.waterbridge.dto.LtAsset;
public interface LtAssetService{


    int deleteByPrimaryKey(Integer id);

    int insert(LtAsset record);

    int insertSelective(LtAsset record);

    LtAsset selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LtAsset record);

    int updateByPrimaryKey(LtAsset record);

}

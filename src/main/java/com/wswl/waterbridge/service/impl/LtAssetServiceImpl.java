package com.wswl.waterbridge.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.wswl.waterbridge.mapper.LtAssetMapper;
import com.wswl.waterbridge.dto.LtAsset;
import com.wswl.waterbridge.service.LtAssetService;
@Service
public class LtAssetServiceImpl implements LtAssetService{

    @Resource
    private LtAssetMapper ltAssetMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return ltAssetMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(LtAsset record) {
        return ltAssetMapper.insert(record);
    }

    @Override
    public int insertSelective(LtAsset record) {
        return ltAssetMapper.insertSelective(record);
    }

    @Override
    public LtAsset selectByPrimaryKey(Integer id) {
        return ltAssetMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(LtAsset record) {
        return ltAssetMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(LtAsset record) {
        return ltAssetMapper.updateByPrimaryKey(record);
    }

}

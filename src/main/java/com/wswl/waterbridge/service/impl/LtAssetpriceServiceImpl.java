package com.wswl.waterbridge.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.wswl.waterbridge.mapper.LtAssetpriceMapper;
import com.wswl.waterbridge.dto.LtAssetprice;
import com.wswl.waterbridge.service.LtAssetpriceService;
@Service
public class LtAssetpriceServiceImpl implements LtAssetpriceService{

    @Resource
    private LtAssetpriceMapper ltAssetpriceMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return ltAssetpriceMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(LtAssetprice record) {
        return ltAssetpriceMapper.insert(record);
    }

    @Override
    public int insertSelective(LtAssetprice record) {
        return ltAssetpriceMapper.insertSelective(record);
    }

    @Override
    public LtAssetprice selectByPrimaryKey(Integer id) {
        return ltAssetpriceMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(LtAssetprice record) {
        return ltAssetpriceMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(LtAssetprice record) {
        return ltAssetpriceMapper.updateByPrimaryKey(record);
    }

}

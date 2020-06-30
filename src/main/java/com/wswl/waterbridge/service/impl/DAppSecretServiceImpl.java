package com.wswl.waterbridge.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.wswl.waterbridge.dto.DAppSecret;
import com.wswl.waterbridge.mapper.DAppSecretMapper;
import com.wswl.waterbridge.service.DAppSecretService;
@Service
public class DAppSecretServiceImpl implements DAppSecretService{

    @Resource
    private DAppSecretMapper dAppSecretMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return dAppSecretMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(DAppSecret record) {
        return dAppSecretMapper.insert(record);
    }

    @Override
    public int insertSelective(DAppSecret record) {
        return dAppSecretMapper.insertSelective(record);
    }

    @Override
    public DAppSecret selectByPrimaryKey(String id) {
        return dAppSecretMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(DAppSecret record) {
        return dAppSecretMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(DAppSecret record) {
        return dAppSecretMapper.updateByPrimaryKey(record);
    }

}

package com.wswl.waterbridge.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.wswl.waterbridge.dto.XIFUser;
import com.wswl.waterbridge.mapper.XIFUserMapper;
import com.wswl.waterbridge.service.XIFUserService;
@Service
public class XIFUserServiceImpl implements XIFUserService{

    @Resource
    private XIFUserMapper xIFUserMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return xIFUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(XIFUser record) {
        return xIFUserMapper.insert(record);
    }

    @Override
    public int insertSelective(XIFUser record) {
        return xIFUserMapper.insertSelective(record);
    }

    @Override
    public XIFUser selectByPrimaryKey(Integer id) {
        return xIFUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(XIFUser record) {
        return xIFUserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(XIFUser record) {
        return xIFUserMapper.updateByPrimaryKey(record);
    }

}

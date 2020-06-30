package com.wswl.waterbridge.service;

import com.wswl.waterbridge.mapper.LtUserMapper;
import com.wswl.waterbridge.dto.LtUser;
import com.wswl.waterbridge.response.CommonResult;

import java.util.Map;

public interface LtUserService{


    CommonResult register(LtUser user);


    LtUser selectUser(Map<String,Object> map);


    int deleteByPrimaryKey(Integer uid);

    int insert(LtUser record);

    int insertSelective(LtUser record);

    LtUser selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(LtUser record);

    int updateByPrimaryKey(LtUser record);

}

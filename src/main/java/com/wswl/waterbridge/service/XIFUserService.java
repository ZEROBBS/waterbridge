package com.wswl.waterbridge.service;

import com.wswl.waterbridge.dto.XIFUser;
import com.wswl.waterbridge.mapper.XIFUserMapper;
public interface XIFUserService{


    int deleteByPrimaryKey(Integer id);

    int insert(XIFUser record);

    int insertSelective(XIFUser record);

    XIFUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(XIFUser record);

    int updateByPrimaryKey(XIFUser record);

}

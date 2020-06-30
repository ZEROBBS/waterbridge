package com.wswl.waterbridge.mapper;

import com.wswl.waterbridge.dto.XIFUser;

public interface XIFUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(XIFUser record);

    int insertSelective(XIFUser record);

    XIFUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(XIFUser record);

    int updateByPrimaryKey(XIFUser record);
}
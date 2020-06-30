package com.wswl.waterbridge.service;

import com.wswl.waterbridge.mapper.UserThirdInfoMapper;
import com.wswl.waterbridge.dto.UserThirdInfo;
public interface UserThirdInfoService{


    int deleteByPrimaryKey(String id);

    int insert(UserThirdInfo record);

    int insertSelective(UserThirdInfo record);

    UserThirdInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(UserThirdInfo record);

    int updateByPrimaryKey(UserThirdInfo record);

}

package com.wswl.waterbridge.mapper;

import com.wswl.waterbridge.dto.LtUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

public interface LtUserMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(LtUser record);

    int insertSelective(LtUser record);

    LtUser selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(LtUser record);

    int updateByPrimaryKey(LtUser record);



    LtUser selectUser(Map<String,Object> map);
}
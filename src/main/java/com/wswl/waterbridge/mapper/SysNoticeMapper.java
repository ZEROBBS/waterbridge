package com.wswl.waterbridge.mapper;

import com.wswl.waterbridge.dto.SysNotice;

public interface SysNoticeMapper {
    int deleteByPrimaryKey(String id);

    int insert(SysNotice record);

    int insertSelective(SysNotice record);

    SysNotice selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysNotice record);

    int updateByPrimaryKey(SysNotice record);
}
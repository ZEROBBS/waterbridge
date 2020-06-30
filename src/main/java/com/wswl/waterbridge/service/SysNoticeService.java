package com.wswl.waterbridge.service;

import com.wswl.waterbridge.dto.SysNotice;
import com.wswl.waterbridge.mapper.SysNoticeMapper;
public interface SysNoticeService{


    int deleteByPrimaryKey(String id);

    int insert(SysNotice record);

    int insertSelective(SysNotice record);

    SysNotice selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysNotice record);

    int updateByPrimaryKey(SysNotice record);

}

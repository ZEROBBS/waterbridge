package com.wswl.waterbridge.mapper;

import com.wswl.waterbridge.dto.DAppComplaint;

public interface DAppComplaintMapper {
    int deleteByPrimaryKey(String id);

    int insert(DAppComplaint record);

    int insertSelective(DAppComplaint record);

    DAppComplaint selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(DAppComplaint record);

    int updateByPrimaryKey(DAppComplaint record);
}
package com.wswl.waterbridge.service;

import com.wswl.waterbridge.mapper.DAppComplaintMapper;
import com.wswl.waterbridge.dto.DAppComplaint;
public interface DAppComplaintService{


    int deleteByPrimaryKey(String id);

    int insert(DAppComplaint record);

    int insertSelective(DAppComplaint record);

    DAppComplaint selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(DAppComplaint record);

    int updateByPrimaryKey(DAppComplaint record);

}

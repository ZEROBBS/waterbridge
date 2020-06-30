package com.wswl.waterbridge.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.wswl.waterbridge.mapper.DAppComplaintMapper;
import com.wswl.waterbridge.dto.DAppComplaint;
import com.wswl.waterbridge.service.DAppComplaintService;
@Service
public class DAppComplaintServiceImpl implements DAppComplaintService{

    @Resource
    private DAppComplaintMapper dAppComplaintMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return dAppComplaintMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(DAppComplaint record) {
        return dAppComplaintMapper.insert(record);
    }

    @Override
    public int insertSelective(DAppComplaint record) {
        return dAppComplaintMapper.insertSelective(record);
    }

    @Override
    public DAppComplaint selectByPrimaryKey(String id) {
        return dAppComplaintMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(DAppComplaint record) {
        return dAppComplaintMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(DAppComplaint record) {
        return dAppComplaintMapper.updateByPrimaryKey(record);
    }

}

package com.cn.crebas.service.role.impl;

import com.cn.crebas.dao.role.StaffUrDao;
import com.cn.crebas.entity.role.StaffUr;
import com.cn.crebas.service.role.StaffUrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StaffUrServiceImpl implements StaffUrService {
    @Autowired
    private StaffUrDao staffUrDao;
    public Integer add(StaffUr staffUr) {
        return staffUrDao.add(staffUr);
    }
}

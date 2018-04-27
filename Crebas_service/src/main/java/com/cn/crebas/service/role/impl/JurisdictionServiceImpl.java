package com.cn.crebas.service.role.impl;

import com.cn.crebas.dao.role.JurisdictionDao;
import com.cn.crebas.entity.role.Jurisdiction;
import com.cn.crebas.service.role.JurisdictionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class JurisdictionServiceImpl implements JurisdictionService {

    @Autowired
    private JurisdictionDao jurisdictionDao;

    public List<Jurisdiction> getAll() {
        return jurisdictionDao.getAll();
    }
}

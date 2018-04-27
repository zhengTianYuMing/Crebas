package com.cn.crebas.service.role.impl;

import com.cn.crebas.dao.role.JmruDao;
import com.cn.crebas.service.role.JmruService;
import com.cn.crebas.vo.Jmru;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class JmruServiceImpl implements JmruService{
    @Autowired
    private JmruDao jmruDao;

    public List<Jmru> getById(Map<String,Object> map) {
        return jmruDao.getById(map);
    }

    public List<Jmru> getByMenu(Map<String, Object> map) {
        return jmruDao.getByMenu(map);
    }


}

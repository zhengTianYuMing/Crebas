package com.cn.crebas.service.user.impl;

import com.cn.crebas.dao.user.UserFansDao;
import com.cn.crebas.entity.user.UserFans;
import com.cn.crebas.service.user.UserFansService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserFansServiceImpl implements UserFansService {

    @Autowired
    private UserFansDao userFansDao;

    public List<UserFans> getById(String userPhone) {
        return userFansDao.getById(userPhone);
    }
}

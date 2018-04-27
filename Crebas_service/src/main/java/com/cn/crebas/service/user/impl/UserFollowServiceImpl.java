package com.cn.crebas.service.user.impl;

import com.cn.crebas.dao.user.UserFollowDao;
import com.cn.crebas.entity.user.UserFollow;
import com.cn.crebas.service.user.UserFollowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserFollowServiceImpl implements UserFollowService {

    @Autowired
    private UserFollowDao userFollowDao;

    public List<UserFollow> getById(String userPhone) {
        return userFollowDao.getById(userPhone);
    }
}

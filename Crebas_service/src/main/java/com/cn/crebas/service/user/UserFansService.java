package com.cn.crebas.service.user;

import com.cn.crebas.entity.user.UserFans;

import java.util.List;

public interface UserFansService {
    List<UserFans> getById(String userPhone);
}

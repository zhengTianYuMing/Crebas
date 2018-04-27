package com.cn.crebas.service.user;

import com.cn.crebas.entity.user.UserFollow;

import java.util.List;

public interface UserFollowService {
    List<UserFollow> getById(String userPhone);
}

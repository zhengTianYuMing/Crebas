package com.cn.crebas.dao.user;

import com.cn.crebas.entity.user.UserFollow;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserFollowDao {
    List<UserFollow> getById(@Param(value = "userPhone")String userPhone);
}

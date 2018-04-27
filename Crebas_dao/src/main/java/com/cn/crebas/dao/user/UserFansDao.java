package com.cn.crebas.dao.user;

import com.cn.crebas.entity.user.UserFans;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserFansDao {
    List<UserFans> getById(@Param(value = "userPhone")String userPhone);
}

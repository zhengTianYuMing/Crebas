package com.cn.crebas.dao.user;

import com.cn.crebas.entity.user.UserInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 作者：zty
 * T_User_Info 的摘要说明
 * 数据操作接口
 */
public interface UserInfoDao
{
    Integer insert(UserInfo model) throws Exception;
    Integer deleteById(@Param(value = "id") Integer id) throws Exception;
    Integer update(UserInfo model);
    UserInfo getById(@Param(value = "id") Integer id) throws Exception;

    Integer count(@Param(value = "userPhone")String userPhone,@Param(value = "itemName")String itemName);

    List<UserInfo> getAll
            (@Param(value = "userPhone")String userPhone,@Param(value = "itemName")String itemName );



    List<UserInfo> getListByMap(Map<String, Object> param) throws Exception;
    List<UserInfo> getPaginationByMap(Map<String, Object> param) throws Exception;
}



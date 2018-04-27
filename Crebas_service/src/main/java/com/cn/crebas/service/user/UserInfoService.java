package com.cn.crebas.service.user;
import com.cn.crebas.common.PagedResult;
import com.cn.crebas.entity.user.UserInfo;

import java.util.List;
import java.util.Map;

/**
 * 作者：zty
 * T_User_Info 的摘要说明
 * 数据操作接口
 */
public interface UserInfoService
{
    Integer insert(UserInfo model) throws Exception;
    Integer deleteById(Integer id) throws Exception;
    Integer update(UserInfo model);
    UserInfo getById(Integer id) throws Exception;

    PagedResult<UserInfo> getAll(String userPhone,String itemName,
    Integer pageNo,Integer pageSize);

    int count(String userPhone,String itemName);
    List<UserInfo> getListByMap(Map<String, Object> param) throws Exception;
    List<UserInfo> getPaginationByMap(Map<String, Object> param) throws Exception;
}



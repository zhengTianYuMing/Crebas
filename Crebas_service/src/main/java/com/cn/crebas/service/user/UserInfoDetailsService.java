package com.cn.crebas.service.user;
import com.cn.crebas.entity.user.UserInfoDetails;
import java.util.List;
import java.util.Map;

/**
 * 作者：zty
 * T_User_Info_Details 的摘要说明
 * 数据操作接口
 */
public interface UserInfoDetailsService
{
    Integer insert(UserInfoDetails model) throws Exception;
    Integer deleteById(Integer id) throws Exception;
    Integer update(UserInfoDetails model) throws Exception;
    UserInfoDetails getById(Integer id) throws Exception;
    List<UserInfoDetails> getAll() throws Exception;
    List<UserInfoDetails> getListByMap(Map<String, Object> param) throws Exception;
    List<UserInfoDetails> getPaginationByMap(Map<String, Object> param) throws Exception;
}



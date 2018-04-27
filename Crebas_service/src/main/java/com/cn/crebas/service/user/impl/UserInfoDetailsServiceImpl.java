package com.cn.crebas.service.user.impl;

import com.cn.crebas.dao.user.UserInfoDetailsDao;
import com.cn.crebas.entity.user.UserInfoDetails;
import com.cn.crebas.service.user.UserInfoDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 作者：zty
 * T_User_Info_Details 的摘要说明
 * 数据操作接口
 */
@Service("t_User_Info_DetailsService")
public class UserInfoDetailsServiceImpl implements UserInfoDetailsService
{
    @Autowired
    private UserInfoDetailsDao userInfoDetailsDao;



    public Integer insert(UserInfoDetails model) throws Exception{
        return userInfoDetailsDao.insert(model);
    }
    public Integer deleteById(Integer id) throws Exception{
        return userInfoDetailsDao.deleteById(id);
    }
    public Integer update(UserInfoDetails model) throws Exception{
        return userInfoDetailsDao.update(model);
    }
    public UserInfoDetails getById(Integer id) throws Exception{
        return userInfoDetailsDao.getById(id);
    }
    public List<UserInfoDetails> getAll() throws Exception{
        return userInfoDetailsDao.getAll();
    }
    public List<UserInfoDetails> getListByMap(Map<String,Object> param) throws Exception{
        return userInfoDetailsDao.getListByMap(param);
    }
    public List<UserInfoDetails> getPaginationByMap(Map<String,Object> param) throws Exception{
        return userInfoDetailsDao.getPaginationByMap(param);
    }
}



package com.cn.crebas.service.user.impl;

import com.cn.crebas.common.BeanUtil;
import com.cn.crebas.common.PagedResult;
import com.cn.crebas.dao.user.UserInfoDao;
import com.cn.crebas.entity.user.UserInfo;
import com.cn.crebas.service.user.UserInfoService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 作者：zty
 * T_User_Info 的摘要说明
 * 数据操作接口
 */
@Service
public class UserInfoServiceImpl implements UserInfoService
{
    @Autowired
    private UserInfoDao userInfoDao;



    public Integer insert(UserInfo model) throws Exception{
        return userInfoDao.insert(model);
    }
    public Integer deleteById(Integer id) throws Exception{
        return userInfoDao.deleteById(id);
    }
    public Integer update(UserInfo model){
        return userInfoDao.update(model);
    }
    public UserInfo getById(Integer id) throws Exception{
        return userInfoDao.getById(id);
    }
    public PagedResult<UserInfo> getAll(String userPhone,String itemName,
                                        Integer pageNo,Integer pageSize){

        pageNo = pageNo == null?1:pageNo;
        pageSize = pageSize == null?10:pageSize;
        PageHelper.startPage(pageNo,pageSize);  //startPage是告诉拦截器说我要开始分页了。分页参数是这两个。
        return BeanUtil.toPagedResult(userInfoDao.getAll(userPhone,itemName));


    }

    public int count(String userPhone, String itemName) {
        return userInfoDao.count(userPhone,itemName);
    }

    public List<UserInfo> getListByMap(Map<String,Object> param) throws Exception{
        return userInfoDao.getListByMap(param);
    }
    public List<UserInfo> getPaginationByMap(Map<String,Object> param) throws Exception{
        return userInfoDao.getPaginationByMap(param);
    }


}



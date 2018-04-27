package com.cn.crebas.service.role.impl;

import com.cn.crebas.common.BeanUtil;
import com.cn.crebas.common.PagedResult;
import com.cn.crebas.dao.role.StaffInfoDao;
import com.cn.crebas.entity.role.StaffInfo;
import com.cn.crebas.service.role.StaffInfoService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 作者：zty
 * T_Staff_Info 的摘要说明
 * 数据操作接口
 */
@Service("StaffInfoServiceImpl")
public class StaffInfoServiceImpl implements StaffInfoService {
    @Autowired
    private StaffInfoDao staffInfoDao;


    public Integer insert(StaffInfo model) {
        return staffInfoDao.insert(model);
    }

    public Integer deleteById(Integer id) {
        return staffInfoDao.deleteById(id);
    }

    public Integer update(StaffInfo model) {
        return staffInfoDao.update(model);
    }

    public StaffInfo getById(Integer id) {
        return staffInfoDao.getById(id);
    }

    public List<StaffInfo> getAll() {
        return staffInfoDao.getAll();
    }

    public PagedResult<StaffInfo> getListByMap(String phone, String sex,
                                               Integer pageNo, Integer pageSize) {
        pageNo = pageNo == null ? 1 : pageNo;
        pageSize = pageSize == null ? 10 : pageSize;
        PageHelper.startPage(pageNo, pageSize);  //startPage是告诉拦截器说我要开始分页了。分页参数是这两个。
        return BeanUtil.toPagedResult(staffInfoDao.getListByMap(phone, sex));
    }


    public StaffInfo login(Map<String,Object> map){
        return staffInfoDao.login(map);
    }

    public Integer count(String phone, String sex){
        return staffInfoDao.count(phone,sex);
    }
}



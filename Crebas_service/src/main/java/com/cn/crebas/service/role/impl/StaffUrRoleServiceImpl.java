package com.cn.crebas.service.role.impl;

import com.cn.crebas.common.BeanUtil;
import com.cn.crebas.common.PagedResult;
import com.cn.crebas.dao.role.StaffUrRoleDao;
import com.cn.crebas.service.role.StaffUrRoleService;
import com.cn.crebas.vo.StaffUrRole;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StaffUrRoleServiceImpl implements StaffUrRoleService {

    @Autowired
    private StaffUrRoleDao staffUrRoleDao;

    public PagedResult<StaffUrRole> getListByParam(String phone, String sex, Integer pageNo, Integer pageSize) {
        pageNo = pageNo == null ? 1 : pageNo;
        pageSize = pageSize == null ? 10 : pageSize;
        PageHelper.startPage(pageNo, pageSize);  //startPage是告诉拦截器说我要开始分页了。分页参数是这两个。
        return BeanUtil.toPagedResult(staffUrRoleDao.getListByParam(phone, sex));
    }

    public Integer updateSr(StaffUrRole staffUrRole) {
        return staffUrRoleDao.updateSr(staffUrRole);
    }

    public StaffUrRole getById(Integer id){
        return staffUrRoleDao.getById(id);
    }
}

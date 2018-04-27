package com.cn.crebas.service.role.impl;

import com.cn.crebas.dao.role.RoleDao;
import com.cn.crebas.entity.role.Role;
import com.cn.crebas.service.role.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao roleDao;

    public List<Role> getAll() {
        return roleDao.getAll();
    }

    public Role getByName(String roleName) {
        return roleDao.getByName(roleName);
    }
}

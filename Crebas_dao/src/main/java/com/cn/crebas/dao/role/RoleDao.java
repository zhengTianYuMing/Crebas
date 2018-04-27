package com.cn.crebas.dao.role;

import com.cn.crebas.entity.role.Role;

import java.util.List;

public interface RoleDao {

    List<Role> getAll();

    Role getByName(String roleName);
}

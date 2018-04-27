package com.cn.crebas.service.role;

import com.cn.crebas.entity.role.Role;

import java.util.List;

public interface RoleService {
    List<Role> getAll();

    Role getByName(String roleName);
}

package com.cn.crebas.entity.role;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@Api(value = "StaffUr",description = "员工角色实体类")
public class StaffUr implements Serializable {
    @ApiModelProperty(value = "id",notes = "序号")
    private Integer id= null;
    @ApiModelProperty(value = "roleId",notes = "角色id")
    private Integer roleId = null;
    @ApiModelProperty(value = "staffId",notes = "员工id")
    private Integer staffId = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }
}

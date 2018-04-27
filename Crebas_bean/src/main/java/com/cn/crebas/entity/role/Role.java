package com.cn.crebas.entity.role;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;

@Api(value = "Role", description = "角色实体类")
public class Role {
    @ApiModelProperty(value = "id", notes = "角色序号")
    private Integer id = null;
    @ApiModelProperty(value = "roleName",notes = "角色名称")
    private String roleName = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}

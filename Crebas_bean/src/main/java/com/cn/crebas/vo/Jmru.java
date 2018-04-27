package com.cn.crebas.vo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@Api(value = "员工角色权限菜单操作")
public class Jmru implements Serializable {
    @ApiModelProperty(value = "phone", notes = "手机号")
    private String phone = null;
    @ApiModelProperty(value = "password", notes = "密码")
    private String password = null;
    @ApiModelProperty(value = "roleId", notes = "角色Id")
    private Integer roleId = null;
    @ApiModelProperty(value = "menuId", notes = "菜单id")
    private Integer menuId = null;
    @ApiModelProperty(value = "jurId", notes = "操作权限id")
    private Integer jurId = null;
    @ApiModelProperty(value = "jurisdiction", notes = "操作权限")
    private String jurisdictionName = null;
    @ApiModelProperty(value = "roleName", notes = "角色名称")
    private String roleName = null;
    @ApiModelProperty(value = "staffId", notes = "管理员Id")
    private Integer staffId = null;
    @ApiModelProperty(value = "菜单文字图片")
    private String menuIcon = null;
    @ApiModelProperty(value = "menuName",notes = "菜单名字")
    private String menuName = null;
    @ApiModelProperty(value = "menuUrl",notes = "菜单路径")
    private String menuUrl = null;
    @ApiModelProperty(value = "parentMenu",notes = "父菜单")
    private Integer parentMenu = null;

    private String menuCode= null;

    public String getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode;
    }

    @ApiModelProperty(value = "id",notes = "菜单id")
    private Integer id= null;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public Integer getJurId() {
        return jurId;
    }

    public void setJurId(Integer jurId) {
        this.jurId = jurId;
    }

    public String getJurisdictionName() {
        return jurisdictionName;
    }

    public void setJurisdictionName(String jurisdictionName) {
        this.jurisdictionName = jurisdictionName;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getMenuIcon() {
        return menuIcon;
    }

    public void setMenuIcon(String menuIcon) {
        this.menuIcon = menuIcon;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }


    public Integer getParentMenu() {
        return parentMenu;
    }

    public void setParentMenu(Integer parentMenu) {
        this.parentMenu = parentMenu;
    }
}

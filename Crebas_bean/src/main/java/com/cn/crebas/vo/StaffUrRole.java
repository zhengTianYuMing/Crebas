package com.cn.crebas.vo;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;


public class StaffUrRole implements Serializable {
    /*  */
    @ApiModelProperty(value = "id",notes = "员工序号")
    private int id;
    /*  */
    @ApiModelProperty(value = "staffCode",notes = "员工编号")
    private String staffCode;
    /*  */
    @ApiModelProperty(value = "staffName",notes = "员工名字")
    private String staffName;
    /*  */
    @ApiModelProperty(value = "phone",notes = "员工手机号")
    private String phone;
    /*  */
    @ApiModelProperty(value = "password",notes = "员工登录密码")
    private String password;
    /*  */
    @ApiModelProperty(value = "sex",notes = "员工性别")
    private String sex;
    /*  */
    @ApiModelProperty(value = "wages",notes = "员工工资")
    private String wages;
    @ApiModelProperty(value = "idCard",notes = "员工身份证")
    private String idCard;
    @ApiModelProperty(value = "contact",notes = "员工联系方式")
    private String contact;
    @ApiModelProperty(value = "Date",notes = "员工入职时间")
    private Date time;
    @ApiModelProperty(value = "roleName",notes = "角色名称")
    private String roleName = null;

    private Integer roleId= null;

    private Integer staffId = null;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStaffCode() {
        return staffCode;
    }

    public void setStaffCode(String staffCode) {
        this.staffCode = staffCode;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getWages() {
        return wages;
    }

    public void setWages(String wages) {
        this.wages = wages;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}

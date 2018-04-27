package com.cn.crebas.vo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
@Api(value = "StaffInfoVo",description = "员工vo")
public class StaffInfoVo {
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

    private Integer pageIndex=null;

    private Integer pageSize=null;

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

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}

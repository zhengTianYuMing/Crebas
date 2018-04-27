package com.cn.crebas.entity.role;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * 作者：zty
 * T_Staff_Info 的摘要说明
 * 
 */
@ApiModel(value = "StaffInfo",description = "员工实体类")
public class StaffInfo implements Serializable
{
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

	/**
	 * 得到
	 * @return int
	 */
	public int getId(){
		return id;
	}
	/**
	 * 设置
	 * @param id
	 */
	public void setId(int id){
		this.id=id;
	}
    /**
	 * 得到
	 * @return String
	 */
	public String getPhone(){
		return phone;
	}
	/**
	 * 设置
	 * @param phone
	 */
	public void setPhone(String phone){
		this.phone=phone;
	}
    /**
	 * 得到
	 * @return String
	 */
	public String getPassword(){
		return password;
	}
	/**
	 * 设置
	 * @param password
	 */
	public void setPassword(String password){
		this.password=password;
	}
    /**
	 * 得到
	 * @return String
	 */
	public String getSex(){
		return sex;
	}
	/**
	 * 设置
	 * @param sex
	 */
	public void setSex(String sex){
		this.sex=sex;
	}
    /**
	 * 得到
	 * @return String
	 */
	public String getWages(){
		return wages;
	}
	/**
	 * 设置
	 * @param wages
	 */
	public void setWages(String wages){
		this.wages=wages;
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

	/**
     * T_Staff_Info的默认构造
	 */
    public StaffInfo()
    {
    }
    /**
     * T_Staff_Info的带参构造
	 */
    public StaffInfo(int id, String staff_code, String staff_name, String phone, String password, String sex, String wages)
    {
        this.id=id;
        this.staffCode=staff_code;
        this.staffName=staff_name;
        this.phone=phone;
        this.password=password;
        this.sex=sex;
        this.wages=wages;
    }


}



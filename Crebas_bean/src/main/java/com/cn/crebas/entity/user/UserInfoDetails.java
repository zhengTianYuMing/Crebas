package com.cn.crebas.entity.user;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

/**
 * 作者：zty
 * T_User_Info_Details 的摘要说明
 * 
 */
@Api(value = "UserInfoDetails",description = "用户详情实体类")
public class UserInfoDetails implements Serializable
{
	/*  */
	@ApiModelProperty(value = "id",notes = "用户序号")
	private Integer id=null;
	/*  */
	@ApiModelProperty(value = "userAge",notes = "用户年龄")
	private Integer userAge=null;
	/* 真实身份 */
	@ApiModelProperty(value = "occupation",notes = "用户真实身份")
	private String occupation=null;
	/*  */
	@ApiModelProperty(value = "address",notes = "用户家庭住址")
	private String address=null;
	/* 积分 */
	@ApiModelProperty(value = "userIntegration",notes = "用户积分")
	private BigInteger userIntegration=null;
	/*  */
	@ApiModelProperty(value = "userPrice",notes = "用户金额")
	private String userPrice=null;
	/*  */
	@ApiModelProperty(value = "createTime",notes = "创建账号时间")
	private Date createTime=null;
	/*  */
	@ApiModelProperty(value = "updateTime",notes = "更改账号时间")
	private Date updateTime=null;
	@ApiModelProperty(value = "alipay",notes = "支付宝账号")
	private String alipay=null;
	/*  */
	@ApiModelProperty(value = "isAlipay",notes = "是否绑定支付宝")
	private Integer isAlipay=null;
	@ApiModelProperty(value = "userSex",notes = "性别")
	private Integer userSex=null;
	/*  */
	@ApiModelProperty(value = "isPayment",notes = "是否设置支付密码1是0否")
	private Integer isPayment=null;
	/*  */
	@ApiModelProperty(value = "isPaymentPwd",notes = "支付密码")
	private String isPaymentPwd=null;
	/*  */
	@ApiModelProperty(value = "lastRegisterTime",notes = "最后登录时间")
	private Date lastRegisterTime=null;
	/* 地图表识 */
	@ApiModelProperty(value = "identify",notes = "地图表识")
	private String identify=null;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserAge() {
		return userAge;
	}

	public void setUserAge(Integer userAge) {
		this.userAge = userAge;
	}

	public String getAlipay() {
		return alipay;
	}

	public void setAlipay(String alipay) {
		this.alipay = alipay;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public BigInteger getUserIntegration() {
		return userIntegration;
	}

	public void setUserIntegration(BigInteger userIntegration) {
		this.userIntegration = userIntegration;
	}

	public String getUserPrice() {
		return userPrice;
	}

	public void setUserPrice(String userPrice) {
		this.userPrice = userPrice;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}


	public Integer getIsAlipay() {
		return isAlipay;
	}

	public void setIsAlipay(Integer isAlipay) {
		this.isAlipay = isAlipay;
	}

	public Integer getIsPayment() {
		return isPayment;
	}

	public void setIsPayment(Integer isPayment) {
		this.isPayment = isPayment;
	}

	public String getIsPaymentPwd() {
		return isPaymentPwd;
	}

	public void setIsPaymentPwd(String isPaymentPwd) {
		this.isPaymentPwd = isPaymentPwd;
	}

	public Date getLastRegisterTime() {
		return lastRegisterTime;
	}

	public void setLastRegisterTime(Date lastRegisterTime) {
		this.lastRegisterTime = lastRegisterTime;
	}

	public String getIdentify() {
		return identify;
	}

	public void setIdentify(String identify) {
		this.identify = identify;
	}

	public Integer getUserSex() {
		return userSex;
	}

	public void setUserSex(Integer userSex) {
		this.userSex = userSex;
	}
}



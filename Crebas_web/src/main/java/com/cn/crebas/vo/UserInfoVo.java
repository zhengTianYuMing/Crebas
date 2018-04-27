package com.cn.crebas.vo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigInteger;

/**
 * 作者：zty
 * T_User_Info 的摘要说明
 * 
 */
@Api(value = "UserInfo",description = "用户实体类")
public class UserInfoVo implements Serializable
{
	/* id */
	@ApiModelProperty(value = "id",notes = "用户序号")
	private BigInteger id;
	/* 用户id */
	@ApiModelProperty(value = "userCode",notes = "用户编码")
	private String userCode;
	/* 用户名 */
	@ApiModelProperty(value = "userName",notes = "用户名字")
	private String userName;
	/* 手机号 */
	@ApiModelProperty(value = "userPhone",notes = "用户手机号")
	private String userPhone;
	/* 密码 */
	@ApiModelProperty(value = "password",notes = "用户登录密码")
	private String password;
	/*  */
	@ApiModelProperty(value = "dictKey",notes = "用户类别序号")
	private Integer dictKey;
	/*  */
	@ApiModelProperty(value = "itemKey",notes = "用户身份序号")
	private Integer itemKey;
	/* 是否启用1是0否 */
	@ApiModelProperty(value = "isUse",notes = "用户账号是否启用")
	private Integer isUse;
	@ApiModelProperty(value = "itemName",notes = "用户身份名称")
	private String itemName;

	private Integer pageIndex=null;

	private Integer pageSize=null;

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getDictKey() {
		return dictKey;
	}

	public void setDictKey(Integer dictKey) {
		this.dictKey = dictKey;
	}

	public Integer getItemKey() {
		return itemKey;
	}

	public void setItemKey(Integer itemKey) {
		this.itemKey = itemKey;
	}

	public Integer getIsUse() {
		return isUse;
	}

	public void setIsUse(Integer isUse) {
		this.isUse = isUse;
	}
}



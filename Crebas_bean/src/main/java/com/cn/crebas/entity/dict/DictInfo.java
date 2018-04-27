package com.cn.crebas.entity.dict;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigInteger;

/**
 * 作者：zty
 * T_Dict_Info 的摘要说明
 * 
 */
@Api(value = "DictInfo",description = "类型种类字典表")
public class DictInfo implements Serializable
{
	/*  */
	@ApiModelProperty(value = "id",notes = "类型种类序号")
	private BigInteger id;
	/*  */
	@ApiModelProperty(value = "dictKey",notes = "类型种类键")
	private String dictKey;
	/*  */
	@ApiModelProperty(value = "dictValue",notes = "类型种类值")
	private String dictValue;
	/*  */
	@ApiModelProperty(value = "isUse",notes = "是否启用")
	private int isUse;

    /**
	 * 得到
	 * @return BigInteger
	 */
	public BigInteger getId(){
		return id;
	}
	/**
	 * 设置
	 * @param id
	 */
	public void setId(BigInteger id){
		this.id=id;
	}

	public String getDictKey() {
		return dictKey;
	}

	public void setDictKey(String dictKey) {
		this.dictKey = dictKey;
	}

	public String getDictValue() {
		return dictValue;
	}

	public void setDictValue(String dictValue) {
		this.dictValue = dictValue;
	}

	public int getIsUse() {
		return isUse;
	}

	public void setIsUse(int isUse) {
		this.isUse = isUse;
	}
}



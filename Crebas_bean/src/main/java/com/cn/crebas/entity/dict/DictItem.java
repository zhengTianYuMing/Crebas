package com.cn.crebas.entity.dict;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * 作者：zty
 * DictItem 的摘要说明
 * 
 */
@Api(value = "DictItem",description = "字典全部类型")
public class DictItem implements Serializable
{
	/*  */
	@ApiModelProperty(value = "id",notes = "字典类型id")
	private int id;
	/*  */
	@ApiModelProperty(value = "id",notes = "类型种类键")
	private String dictKey;
	/*  */
	@ApiModelProperty(value = "itemKey",notes = "类型键")
	private String itemKey;
	/*  */
	@ApiModelProperty(value = "itemName",notes = "类型值")
	private String itemName;

	@ApiModelProperty(value = "size",notes = "宠物大小")
	private Integer size= null;
	/*  */
	@ApiModelProperty(value = "time",notes = "几个月")
	private int time;
	/*  */
	@ApiModelProperty(value = "fItemKey",notes = "父键")
	private int fItemKey;
	/*  */
	@ApiModelProperty(value = "createTime",notes = "创建时间")
	private Date createTime;
	/*  */
	@ApiModelProperty(value = "updateTime",notes = "更改时间")
	private Date updateTime;
	/*  */
	@ApiModelProperty(value = "isUse", notes = "是否启用")
	private int isUse;

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

	public String getDictKey() {
		return dictKey;
	}

	public void setDictKey(String dictKey) {
		this.dictKey = dictKey;
	}

	public String getItemKey() {
		return itemKey;
	}

	public void setItemKey(String itemKey) {
		this.itemKey = itemKey;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public int getfItemKey() {
		return fItemKey;
	}

	public void setfItemKey(int fItemKey) {
		this.fItemKey = fItemKey;
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

	public int getIsUse() {
		return isUse;
	}

	public void setIsUse(int isUse) {
		this.isUse = isUse;
	}
}



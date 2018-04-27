package com.cn.crebas.entity.role;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * 作者：zty
 * T_Html_Menu 的摘要说明
 * 
 */
@ApiModel(value = "HtmlMenu",description ="左侧导航栏" )
public class HtmlMenu implements Serializable
{
	/*  */
	@ApiModelProperty(value = "id",notes = "导航序号")
	private int id;
	/*  */
	@ApiModelProperty(value = "menuCode",notes = "导航编码")
	private String menuCode;
	/*  */
	@ApiModelProperty(value = "menuName",notes = "导航名称")
	private String menuName;
	/*  */
	@ApiModelProperty(value = "menuUrl",notes = "导航地址")
	private String menuUrl;
	/* 父菜单 */
	@ApiModelProperty(value = "parentMenu",notes = "父导航id")
	private int parentMenu;

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
	public String getMenuCode() {
		return menuCode;
	}

	public void setMenuCode(String menuCode) {
		this.menuCode = menuCode;
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

	public int getParentMenu() {
		return parentMenu;
	}

	public void setParentMenu(int parentMenu) {
		this.parentMenu = parentMenu;
	}
}



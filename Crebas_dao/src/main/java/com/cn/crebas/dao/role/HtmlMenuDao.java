package com.cn.crebas.dao.role;


import com.cn.crebas.entity.role.HtmlMenu;

import java.util.List;

/**
 * 作者：zty
 * T_Html_Menu左侧导航栏
 * 数据操作接口
 */
public interface HtmlMenuDao
{
    /**
     * 获取全部导航
     * @return
     */
    List<HtmlMenu> getAll();
}



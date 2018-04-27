package com.cn.crebas.service.role.impl;

import com.cn.crebas.dao.role.HtmlMenuDao;
import com.cn.crebas.entity.role.HtmlMenu;
import com.cn.crebas.service.role.HtmlMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 作者：zty
 * T_Html_Menu 的摘要说明
 * 数据操作接口
 */
@Service
public class HtmlMenuServiceImpl implements HtmlMenuService
{
    @Autowired
    private HtmlMenuDao htmlMenuDao;

    public List<HtmlMenu> getAll(){
        return htmlMenuDao.getAll();
    }
}



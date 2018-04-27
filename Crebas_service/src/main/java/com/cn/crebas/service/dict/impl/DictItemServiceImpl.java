package com.cn.crebas.service.dict.impl;

import com.cn.crebas.dao.dict.DictItemDao;
import com.cn.crebas.entity.dict.DictItem;
import com.cn.crebas.service.dict.DictItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 作者：zty
 * T_Dict_Item 的摘要说明
 * 数据操作接口
 */
@Service("t_Dict_ItemService")
public class DictItemServiceImpl implements DictItemService
{
    @Autowired
    private DictItemDao dictItemDao;


    public Integer insert(DictItem model) throws Exception{
        return dictItemDao.insert(model);
    }
    public Integer deleteById(Integer id) throws Exception{
        return dictItemDao.deleteById(id);
    }
    public Integer update(DictItem model) throws Exception{
        return dictItemDao.update(model);
    }
    public DictItem getById(Integer id) throws Exception{
        return dictItemDao.getById(id);
    }
    public List<DictItem> getAll() throws Exception{
        return dictItemDao.getAll();
    }
    public List<DictItem> getListByMap(DictItem modelm) throws Exception{
        return dictItemDao.getListByMap(modelm);
    }
    public List<DictItem> getPaginationByMap(Map<String,Object> param) throws Exception{
        return dictItemDao.getPaginationByMap(param);
    }
}



package com.cn.crebas.service.dict.impl;

import com.cn.crebas.dao.dict.DictInfoDao;
import com.cn.crebas.entity.dict.DictInfo;
import com.cn.crebas.service.dict.DictInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;

/**
 * 作者：zty
 * T_Dict_Info 的摘要说明
 * 数据操作接口
 */
@Service("t_Dict_InfoService")
public class DictInfoServiceImpl implements DictInfoService
{
    @Autowired
    private DictInfoDao dictInfoDao;


    public Integer insert(DictInfo model) throws Exception{
        return dictInfoDao.insert(model);
    }
    public Integer deleteById(Integer id) throws Exception{
        return dictInfoDao.deleteById(id);
    }
    public Integer update(DictInfo model) throws Exception{
        return dictInfoDao.update(model);
    }
    public DictInfo getById(Integer id) throws Exception{
        return dictInfoDao.getById(id);
    }
    public List<DictInfo> getAll() throws Exception{
        return dictInfoDao.getAll();
    }
    public List<DictInfo> getListByMap(Map<String,Object> param) throws Exception{
        return dictInfoDao.getListByMap(param);
    }
    public List<DictInfo> getPaginationByMap(Map<String,Object> param) throws Exception{
        return dictInfoDao.getPaginationByMap(param);
    }
}



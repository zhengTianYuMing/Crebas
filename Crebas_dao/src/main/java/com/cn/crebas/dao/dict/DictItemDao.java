package com.cn.crebas.dao.dict;

import com.cn.crebas.entity.dict.DictItem;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

/**
 * 作者：zty
 * T_Dict_Item 的摘要说明
 * 数据操作接口
 */
public interface DictItemDao
{
    Integer insert(DictItem model) throws Exception;
    Integer deleteById(@Param(value = "id") Integer id) throws Exception;
    Integer update(DictItem model) throws Exception;
    DictItem getById(@Param(value = "id") Integer id) throws Exception;
    List<DictItem> getAll() throws Exception;
    List<DictItem> getListByMap(DictItem model) throws Exception;
    List<DictItem> getPaginationByMap(Map<String, Object> param) throws Exception;
}



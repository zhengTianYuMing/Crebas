package com.cn.crebas.service.dict;
import com.cn.crebas.entity.dict.DictInfo;
import java.util.List;
import java.util.Map;

/**
 * 作者：zty
 * T_Dict_Info 的摘要说明
 * 数据操作接口
 */
public interface DictInfoService
{
    Integer insert(DictInfo model) throws Exception;
    Integer deleteById(Integer id) throws Exception;
    Integer update(DictInfo model) throws Exception;
    DictInfo getById(Integer id) throws Exception;
    List<DictInfo> getAll() throws Exception;
    List<DictInfo> getListByMap(Map<String, Object> param) throws Exception;
    List<DictInfo> getPaginationByMap(Map<String, Object> param) throws Exception;
}



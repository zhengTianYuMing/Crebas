package com.cn.crebas.dao.role;

import com.cn.crebas.entity.role.StaffInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 作者：zty
 * 员工dao
 * 数据操作接口
 */
public interface StaffInfoDao
{
    /**
     * 添加
     * @param model
     * @return
     */
    Integer insert(StaffInfo model) ;
    Integer deleteById(@Param(value = "id") Integer id) ;
    Integer update(StaffInfo model) ;
    StaffInfo getById(@Param(value = "id") Integer id);
    List<StaffInfo> getAll();
    List<StaffInfo> getListByMap(@Param(value = "phone")String phone,@Param(value = "sex")String sex);
    StaffInfo login(Map<String,Object> map);

    Integer count(@Param(value = "phone")String phone,@Param(value = "sex")String sex);
}



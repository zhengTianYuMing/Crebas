package com.cn.crebas.dao.role;

import com.cn.crebas.vo.StaffUrRole;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StaffUrRoleDao {

    //按条件分页查询
    List<StaffUrRole> getListByParam
    (@Param(value = "phone")String phone,@Param(value = "sex")String sex);

    Integer updateSr(StaffUrRole staffUrRole);

    StaffUrRole getById(@Param(value = "id")Integer id);
}

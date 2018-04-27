package com.cn.crebas.dao.role;

import com.cn.crebas.entity.role.StaffUr;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StaffUrDao {
    Integer add(StaffUr staffUr);
    List<StaffUr> getAll();
    Integer deleteById(@Param(value = "staffId")Integer staffId);
}

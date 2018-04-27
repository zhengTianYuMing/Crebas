package com.cn.crebas.service.role;

import com.cn.crebas.common.PagedResult;
import com.cn.crebas.vo.StaffUrRole;

public interface StaffUrRoleService {
    PagedResult<StaffUrRole> getListByParam(String phone, String sex,
                                          Integer pageNo, Integer pageSize);

    Integer updateSr(StaffUrRole staffUrRole);

    StaffUrRole getById(Integer id);
}

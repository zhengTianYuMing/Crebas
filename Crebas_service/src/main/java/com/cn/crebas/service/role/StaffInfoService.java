package com.cn.crebas.service.role;
import com.cn.crebas.common.PagedResult;
import com.cn.crebas.entity.role.StaffInfo;
import java.util.List;
import java.util.Map;

/**
 * 作者：zty
 * T_Staff_Info 的摘要说明
 * 数据操作接口
 */
public interface StaffInfoService
{
    Integer insert(StaffInfo model);
    Integer deleteById(Integer id);
    Integer update(StaffInfo model);
    StaffInfo getById(Integer id);
    List<StaffInfo> getAll();
    PagedResult<StaffInfo> getListByMap(String phone, String sex,
                                        Integer pageNo, Integer pageSize);
    StaffInfo login(Map<String,Object> map);

    Integer count(String phone, String sex);
}



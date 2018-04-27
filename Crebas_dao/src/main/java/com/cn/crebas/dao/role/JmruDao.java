package com.cn.crebas.dao.role;

import com.cn.crebas.vo.Jmru;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface JmruDao {
    List<Jmru> getById(Map<String,Object> map);

    //查询角色对菜单的权限
    List<Jmru> getByMenu(Map<String,Object> map);
}

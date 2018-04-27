package com.cn.crebas.service.role;

import com.cn.crebas.vo.Jmru;

import java.util.List;
import java.util.Map;

public interface JmruService {
    List<Jmru> getById(Map<String,Object> map);
    List<Jmru> getByMenu(Map<String,Object> map);
}

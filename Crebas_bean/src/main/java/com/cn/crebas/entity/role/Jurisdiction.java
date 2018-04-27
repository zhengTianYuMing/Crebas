package com.cn.crebas.entity.role;

import io.swagger.annotations.Api;

@Api(value = "Jurisdiction",description = "权限实体类")
public class Jurisdiction {

    private Integer id= null;

    private String jurisdictionName = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJurisdictionName() {
        return jurisdictionName;
    }

    public void setJurisdictionName(String jurisdictionName) {
        this.jurisdictionName = jurisdictionName;
    }
}

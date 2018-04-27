package com.cn.crebas.entity.user;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class UserFollow implements Serializable {
    /*  */
    private Integer id;
    /*  */
    private String followCode;
    /*  */
    private Integer userId;
    /* 关注 */
    private Integer followId;
    /*  */
    private String folloName;

    @ApiModelProperty(value = "userPhone",notes = "用户手机号")
    private String userPhone=null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFollowCode() {
        return followCode;
    }

    public void setFollowCode(String followCode) {
        this.followCode = followCode;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getFollowId() {
        return followId;
    }

    public void setFollowId(Integer followId) {
        this.followId = followId;
    }

    public String getFolloName() {
        return folloName;
    }

    public void setFolloName(String folloName) {
        this.folloName = folloName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }
}

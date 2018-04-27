package com.cn.crebas.entity.user;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@Api(value = "UserFans",description = "用户粉丝表")
public class UserFans implements Serializable {
    /*  */
    @ApiModelProperty(value = "id",notes = "序号")
    private int id;
    /*  */
    @ApiModelProperty(value = "fansCode",notes = "编号")
    private String fansCode;
    /*  */
    @ApiModelProperty(value = "userId",notes = "用户id")
    private int userId;
    /*  */
    @ApiModelProperty(value = "fansId",notes = "粉丝id")
    private int fansId;
    /*  */
    @ApiModelProperty(value = "fansName",notes = "粉丝名字")
    private String fansName;

    @ApiModelProperty(value = "userPhone",notes = "用户手机号")
    private String userPhone=null;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFansCode() {
        return fansCode;
    }

    public void setFansCode(String fansCode) {
        this.fansCode = fansCode;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getFansId() {
        return fansId;
    }

    public void setFansId(int fansId) {
        this.fansId = fansId;
    }

    public String getFansName() {
        return fansName;
    }

    public void setFansName(String fansName) {
        this.fansName = fansName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }
}

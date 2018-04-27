package com.cn.crebas.vo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigInteger;
@Api(value = "DictInfoVo",description = "类型vo")
public class DictInfoVo {

    /*  */
    @ApiModelProperty(value = "id",notes = "类型种类序号")
    private BigInteger id;
    /*  */
    @ApiModelProperty(value = "dictKey",notes = "类型种类键")
    private String dictKey;
    /*  */
    @ApiModelProperty(value = "dictValue",notes = "类型种类值")
    private String dictValue;
    /*  */
    @ApiModelProperty(value = "isUse",notes = "是否启用")
    private Integer isUse;
    @ApiModelProperty(value = "pageIndex",notes = "当前页码")
    private Integer pageIndex=null;

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    /**
     * 得到
     * @return BigInteger
     */
    public BigInteger getId(){
        return id;
    }
    /**
     * 设置
     * @param id
     */
    public void setId(BigInteger id){
        this.id=id;
    }

    public String getDictKey() {
        return dictKey;
    }

    public void setDictKey(String dictKey) {
        this.dictKey = dictKey;
    }

    public String getDictValue() {
        return dictValue;
    }

    public void setDictValue(String dictValue) {
        this.dictValue = dictValue;
    }

    public Integer getIsUse() {
        return isUse;
    }

    public void setIsUse(Integer isUse) {
        this.isUse = isUse;
    }
}

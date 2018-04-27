package com.cn.crebas.controller.dict;

import com.cn.crebas.entity.dict.DictItem;
import com.cn.crebas.service.dict.DictItemService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@Api(value = "DictItemController", description = "员工信息控制类")
@RequestMapping("/dictItem")
public class DictItemController {
    @Autowired
    private DictItemService dictItemService;

    @ApiOperation(value = "/getByParam", httpMethod = "POST", notes = "登录", produces = "application/json")
    @ResponseBody
    @ApiResponse(code = 200,message = "查询成功")
    @RequestMapping(value = "/getByParam")
    public Object getByParam(@RequestBody(required = false) DictItem dictItem){
        List<DictItem> list = null;
        try {
            list = dictItemService.getListByMap(dictItem);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}

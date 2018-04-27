package com.cn.crebas.controller.role;

import com.alibaba.fastjson.JSON;
import com.cn.crebas.entity.role.HtmlMenu;
import com.cn.crebas.service.role.HtmlMenuService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/menu")
@Api(value = "UserInfoController",description = "用户控制")
public class HtmlMenuController {

    @Autowired
    HtmlMenuService htmlMenuService;

    @RequestMapping(value = "/sel")
    @ApiOperation(value = "/sel",
            notes = "查询", httpMethod = "POST", produces = "application/json")
    @ApiResponse(code = 200, message = "查询成功")
    @ResponseBody
    private Object getAll(){
        List<HtmlMenu> list = null;
        try {
            list = htmlMenuService.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return JSON.toJSONString(list);
    }

}

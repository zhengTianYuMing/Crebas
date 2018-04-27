package com.cn.crebas.controller.role;

import com.cn.crebas.entity.role.Jurisdiction;
import com.cn.crebas.service.role.JurisdictionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@Api(value = "JmruController", description = "权限控制类")
@RequestMapping("/juc")
public class JurisdictionController {

    @Autowired
    private JurisdictionService jurisdictionService;

    @RequestMapping("/getById")
    @ResponseBody
    @ApiOperation(value = "/getAll",notes = "所有权限查询",
            httpMethod = "POST",produces = "application/json")
    @ApiResponse(code = 200,message = "查询成功")
    public Object getAll(){
        List<Jurisdiction> list = jurisdictionService.getAll();
        return list;
    }
}

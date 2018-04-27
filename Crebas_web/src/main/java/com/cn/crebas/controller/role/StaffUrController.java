package com.cn.crebas.controller.role;

import com.cn.crebas.dto.ResultDTO;
import com.cn.crebas.entity.role.StaffUr;
import com.cn.crebas.service.role.StaffUrService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "staffUr")
@Api(value = "StaffInfoController", description = "员工角色控制类")
public class StaffUrController {

    @Autowired
    private StaffUrService staffUrService;

    @RequestMapping("/add")
    @ApiOperation(value = "/add", httpMethod = "POST", notes = "登录", produces = "application/json")
    @ResponseBody
    @ApiResponse(code = 200, message = "登录成功")
    public Object add(@RequestBody(required = false)StaffUr staffUr){
        ResultDTO dto = new ResultDTO();
        if(staffUrService.add(staffUr)>0){
            dto.setCode(200);
            dto.setMsg("添加成功");
        }
        else{
            dto.setCode(400);
            dto.setMsg("添加失败");
        }
        return dto;
    }
}

package com.cn.crebas.controller.role;

import com.cn.crebas.entity.role.Role;
import com.cn.crebas.service.role.RoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import net.bytebuddy.asm.Advice;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@Api(value = "RoleController", description = "角色控制类")
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @RequestMapping("/getAll")
    @ResponseBody
    @ApiOperation(value = "/getById",notes = "角色查询",
            httpMethod = "POST",produces = "application/json")
    @ApiResponse(code = 200,message = "查询成功")
    public Object getAll(){
        List<Role> list = roleService.getAll();
        return list;
    }

    @RequestMapping("/getByName")
    @ResponseBody
    @ApiOperation(value = "/getByName",notes = "根据角色名字查询角色信息",
            httpMethod = "POST",produces = "application/json")
    @ApiResponse(code = 200,message = "查询成功")
    public Object getByName(@RequestBody(required = false)Role role){
        Role role1= roleService.getByName(role.getRoleName());
        return role1;
    }
}

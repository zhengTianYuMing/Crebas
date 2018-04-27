package com.cn.crebas.controller.user;

import com.cn.crebas.dto.ResultDTO;
import com.cn.crebas.entity.user.UserInfoDetails;
import com.cn.crebas.service.user.UserInfoDetailsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/userInfoDetails")
@Api(value = "UserInfoDetailsController",description = "用户详情控制")
public class UserInfoDetailsController {

    @Autowired
    private UserInfoDetailsService userInfoDetailsService;

    @RequestMapping(value = "/getById")
    @ApiOperation(value = "/getById",
            notes = "按id查询用户详情", httpMethod = "POST", produces = "application/json")
    @ApiResponse(code = 200, message = "查询成功")
    @ResponseBody
    public Object getById(@RequestBody(required = false)UserInfoDetails userInfoDetails){

        ResultDTO dto= new ResultDTO();
        try {
            if(userInfoDetailsService.getById(userInfoDetails.getId())!=null){
                dto.setCode(200);
                dto.setMsg("查询成功");
                dto.setData(userInfoDetailsService.getById(userInfoDetails.getId()));
            }else{
                dto.setCode(400);
                dto.setMsg("查询失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  dto;
    }
}

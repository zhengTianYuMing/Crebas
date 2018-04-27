package com.cn.crebas.controller.user;

import com.cn.crebas.common.PagedResult;
import com.cn.crebas.dto.ResultDTO;
import com.cn.crebas.entity.user.UserInfo;
import com.cn.crebas.service.user.UserInfoService;
import com.cn.crebas.vo.UserInfoVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/userInfo")
@Api(value = "UserInfoController",description = "用户控制")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;


    @RequestMapping(value = "/sel")
    @ApiOperation(value = "/sel",
            notes = "分页查询", httpMethod = "POST", produces = "application/json")
    @ApiResponse(code = 200, message = "查询成功")
    @ResponseBody
    public Object getAll(@RequestBody(required = false)UserInfoVo userInfoVo) {
        PagedResult<UserInfo> list =null;

            list=userInfoService.getAll(userInfoVo.getUserPhone(),userInfoVo.getItemName(),userInfoVo.getPageIndex()
            ,userInfoVo.getPageSize());

        return list;
    }

    @RequestMapping(value = "/upd")
    @ApiOperation(value = "/upd",
            notes = "更改用户状态", httpMethod = "POST", produces = "application/json")
    @ApiResponse(code = 200, message = "查询成功")
    @ResponseBody
    public Object update(@RequestBody(required = false)UserInfo userInfo){
        ResultDTO dto= new ResultDTO();
        try {
            if(userInfoService.update(userInfo)>0){
                dto.setMsg("更改成功");
                dto.setCode(200);
            }
            else{
                dto.setMsg("更改失败");
                dto.setCode(400);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dto;
    }

    @RequestMapping(value = "/count")
    @ApiOperation(value = "/count",
            notes = "更改用户状态", httpMethod = "POST", produces = "application/json")
    @ApiResponse(code = 200, message = "查询成功")
    @ResponseBody
    public Object count(@RequestBody(required = false)UserInfoVo userInfoVo){
        Integer count= userInfoService.count(userInfoVo.getUserPhone(),userInfoVo.getItemName());
        return count;
    }

}

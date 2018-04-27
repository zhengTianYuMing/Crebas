package com.cn.crebas.controller.role;

import com.cn.crebas.common.PagedResult;
import com.cn.crebas.dto.ResultDTO;
import com.cn.crebas.entity.role.StaffInfo;
import com.cn.crebas.service.role.StaffUrRoleService;
import com.cn.crebas.vo.StaffUrRole;
import com.cn.crebas.vo.StaffUrRoleVo;
import com.sun.org.apache.regexp.internal.RE;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/staffUrRole")
@Api(value = "StaffUrRoleController", description = "员工角色控制类")
public class StaffUrRoleController {

    @Autowired
    private StaffUrRoleService staffUrRoleService;

    @RequestMapping("/getListByParam")
    @ApiOperation(value = "/getListByParam", httpMethod = "POST",
            notes = "按条件分页查询", produces = "application/json")
    @ResponseBody
    @ApiResponse(code = 200, message = "查询成功")
    public Object getListByParam(@RequestBody(required = false)StaffUrRoleVo staffUrRoleVo){
        PagedResult<StaffUrRole> list = null;

        list = staffUrRoleService.getListByParam
                (staffUrRoleVo.getPhone(), staffUrRoleVo.getSex(), staffUrRoleVo.getPageIndex(),
                        staffUrRoleVo.getPageSize());
        return list;
    }
    @RequestMapping("/updateSr")
    @ApiOperation(value = "/updateSr", httpMethod = "POST",
            notes = "更改员工信息", produces = "application/json")
    @ResponseBody
    @ApiResponse(code = 200, message = "更改成功")
    public Object updateSr(@RequestBody(required = false)StaffUrRole staffUrRole){
        ResultDTO dto = new ResultDTO();
        if(staffUrRoleService.updateSr(staffUrRole)>0){
            dto.setCode(200);
            dto.setMsg("更改成功");
        }else{
            dto.setCode(400);
            dto.setMsg("更改失败");
        }

        return dto;
    }

    @RequestMapping("/getById")
    @ApiOperation(value = "/getById", httpMethod = "POST",
            notes = "更改员工信息", produces = "application/json")
    @ResponseBody
    @ApiResponse(code = 200, message = "更改成功")
    public Object getById(@RequestBody(required = false)StaffUrRole staffUrRole){
        StaffUrRole staffUrRole1= staffUrRoleService.getById(staffUrRole.getId());
        return staffUrRole1;
    }


}

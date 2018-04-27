package com.cn.crebas.controller.role;

import com.cn.crebas.common.Md5Encrypt;
import com.cn.crebas.common.PagedResult;
import com.cn.crebas.dto.ResultDTO;
import com.cn.crebas.entity.role.StaffInfo;
import com.cn.crebas.entity.user.UserInfo;
import com.cn.crebas.service.role.StaffInfoService;
import com.cn.crebas.vo.StaffInfoVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;
/**
 * 作者：zty
 * T_Staff_Info 的摘要说明
 * 数据操作接口
 */

/**
 * GET /t_Staff_Info：列出所有记录
 * POST /t_Staff_Info：新建一个记录
 * GET /t_Staff_Info/ID：获取某个指定的信息
 * PUT /t_Staff_Info/ID：更新某个指定的信息（提供该的全部信息）
 * DELETE /t_Staff_Info/ID：删除某个
 * GET /t_Staff_Info/search?param：查找符合条件的
 * GET /t_Staff_Info/page/{pageIndex}?param：列出符合查询条件的分页记录
 */
@Controller
@Api(value = "StaffInfoController", description = "员工信息控制类")
@RequestMapping("/staffInfo")
@SessionAttributes()
public class StaffInfoController {
    @Autowired
    private StaffInfoService staffInfoService;

    @RequestMapping("/login")
    @ApiOperation(value = "/login", httpMethod = "POST", notes = "登录", produces = "application/json")
    @ResponseBody
    @ApiResponse(code = 200, message = "登录成功")
    public Object login(@RequestBody(required = false) StaffInfo staffInfo) {
        StaffInfo list = null;
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("phone", staffInfo.getPhone());
        String pwd = Md5Encrypt.md5(staffInfo.getPassword(), "utf-8");
        map.put("password", pwd);
        list = staffInfoService.login(map);
        return list;
    }

    @RequestMapping("/getListByParam")
    @ApiOperation(value = "/getListByParam", httpMethod = "POST",
            notes = "按条件分页查询", produces = "application/json")
    @ResponseBody
    @ApiResponse(code = 200, message = "登录成功")
    public Object getListByParam(@RequestBody(required = false) StaffInfoVo staffInfoVo) {
        PagedResult<StaffInfo> list = null;

        list = staffInfoService.getListByMap
                (staffInfoVo.getPhone(), staffInfoVo.getSex(), staffInfoVo.getPageIndex()
                        , staffInfoVo.getPageSize());

        return list;
    }

    @RequestMapping("/count")
    @ApiOperation(value = "/count", httpMethod = "POST",
            notes = "按条件查询员工数量", produces = "application/json")
    @ResponseBody
    @ApiResponse(code = 200, message = "查询成功")
    public Object count(@RequestBody(required = false) StaffInfoVo staffInfoVo) {
        Integer count = staffInfoService.count(staffInfoVo.getPhone(), staffInfoVo.getSex());
        return count;
    }


    @RequestMapping("/delete")
    @ApiOperation(value = "/delete", httpMethod = "POST",
            notes = "按id删除员工", produces = "application/json")
    @ResponseBody
    @ApiResponse(code = 200, message = "删除成功")
    public Object deleteById(@RequestBody(required = false) StaffInfo staffInfo) {

        ResultDTO dto = new ResultDTO();
        if(staffInfoService.deleteById(staffInfo.getId())>0){
            dto.setCode(200);
            dto.setMsg("删除成功");
        }else{
            dto.setCode(200);
            dto.setMsg("删除失败");
        }
        return dto;
    }

}



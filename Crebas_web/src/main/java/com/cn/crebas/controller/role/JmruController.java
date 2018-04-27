package com.cn.crebas.controller.role;

import com.cn.crebas.dto.ResultDTO;
import com.cn.crebas.service.role.JmruService;
import com.cn.crebas.vo.Jmru;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@Api(value = "JmruController", description = "管理员权限控制类")
@RequestMapping("/jc")
public class JmruController {
    @Autowired
    private JmruService jmruService;

    @RequestMapping("/getById")
    @ResponseBody
    @ApiOperation(value = "/getById",notes = "管理员权限查询",
            httpMethod = "POST",produces = "application/json")
    @ApiResponse(code = 200,message = "查询成功")
    public Object getById(@RequestBody(required = false)Jmru jmru){
        Map<String,Object> map= new HashMap<String ,Object>();
        String phone = jmru.getPhone();
        String password= jmru.getPassword();
        map.put("phone",phone);
        map.put("jurId",jmru.getJurId());
        map.put("password",password);
        List<Jmru> list= jmruService.getById(map);
        return list;
    }

    @RequestMapping("/getByMenu")
    @ResponseBody
    @ApiOperation(value = "/getByMenu",notes = "菜单权限查询",
            httpMethod = "POST",produces = "application/json")
    @ApiResponse(code = 200,message = "查询成功")
    public Object getByMenu(@RequestBody(required = false)Jmru jmru){
        ResultDTO dto = new ResultDTO();
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("menuName",jmru.getMenuName());
        map.put("staffId",jmru.getStaffId());

        List<Jmru> list = jmruService.getByMenu(map);
        if(list!=null){
            dto.setCode(200);
            dto.setMsg("查询成功");
            dto.setData(list);
        }
        return dto;
    }
}

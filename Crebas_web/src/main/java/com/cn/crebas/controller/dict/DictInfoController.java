package com.cn.crebas.controller.dict;

import com.cn.crebas.dto.ResultDTO;
import com.cn.crebas.entity.dict.DictInfo;
import com.cn.crebas.service.dict.DictInfoService;
import com.cn.crebas.vo.DictInfoVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
@Api(value = "DictInfoController", description = "全部类型控制类")
@RequestMapping("/dictInfo")
public class DictInfoController {

    @Autowired
    DictInfoService dictInfoService;

    private Integer pageIndex=1;

    @RequestMapping(value = "/page")
    @ApiOperation(value = "/page",
            notes = "分页查询", httpMethod = "POST", produces = "application/json")
    @ApiResponse(code = 200, message = "查询成功")
    @ResponseBody
    public Object getAll(@RequestBody(required = false)DictInfoVo dictInfoVo) throws Exception {

        if(dictInfoVo.getPageIndex()!=null){
            pageIndex=dictInfoVo.getPageIndex();
        }
        PageHelper.startPage(pageIndex,2);

        List<DictInfo> list=dictInfoService.getAll();
        PageInfo<DictInfo> info= new PageInfo<DictInfo>(list);
        return info;

    }

    @RequestMapping(value = "/add")
    @ApiOperation(value = "/add",
            notes = "添加", httpMethod = "POST", produces = "application/json")
    @ApiResponse(code = 200, message = "查询成功")
    @ResponseBody
    public Object addInfo(@RequestBody(required = false)DictInfo dictInfo){
        ResultDTO dto= new ResultDTO();
        try {
            if(dictInfoService.insert(dictInfo)>0){
                dto.setCode(200);
                dto.setMsg("添加成功");
            }
            else{
                dto.setCode(400);
                dto.setMsg("添加失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dto;
    }

}

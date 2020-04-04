package com.rental.rental_info_sys.controller;

import com.github.pagehelper.PageInfo;
import com.rental.rental_info_sys.domain.HouseInfo;
import com.rental.rental_info_sys.service.HouseInfoService;
import com.rental.rental_info_sys.util.JSONResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author 12030
 * @version V1.0
 * @ProjectName:IntelliJ IDEA
 * @PackageName: com.rental.rental_info_sys.controller
 * @ClassName: HouseInfoController
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @date 2020/3/12 22:49
 * @Copyright 迷笛age版权所有
 */
@RestController
@RequestMapping("/info")
@Api(tags = {"房屋详细信息接口"})
public class HouseInfoController {

    @Autowired
    private HouseInfoService houseInfoService;


    @ApiOperation(value = "分页显示租房信息")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(paramType = "query",name = "page",value = "页码",required = true,dataType = "int" ,defaultValue = "1"),
            @ApiImplicitParam(paramType = "query",name = "size",value = "页大小",required = false,dataType = "int" ,defaultValue = "2"),
    })
    @GetMapping("/list")
    public JSONResult pageHouseInfo(
            @RequestParam(value = "page",defaultValue = "1") Integer page,
            @RequestParam(value = "size",defaultValue = "2") Integer size
    ){
        PageInfo<HouseInfo> houseInfoList = houseInfoService.findAllHouseInfo(page, size);
        return JSONResult.retSuc(houseInfoList);
    }



    @GetMapping("/show/{houseId}")
    public JSONResult showHouseInfo(@PathVariable("houseId")Integer houseId){
        HouseInfo oneHouseInfo = houseInfoService.findOneHouseInfo(houseId);
        return JSONResult.retSuc(oneHouseInfo);
    }

    @ApiOperation("添加租房信息")
    @ApiImplicitParam(name = "houseInfo",value = "租房信息实体",required = true,paramType = "body",dataType = "HouseInfo" )
    @PostMapping("/add")
    public JSONResult addHouseInfo(@RequestBody HouseInfo houseInfo){
        Boolean result = houseInfoService.addHouseInfo(houseInfo);
        if (result) {
            return JSONResult.retSuc(200, "添加租房信息成功");
        } else {
            return JSONResult.retSuc(500, "添加租房信息成功");
        }
    }
    @ApiOperation("修改租房信息")
    @ApiImplicitParam(name = "houseInfo",value = "租房信息实体",required = true,paramType = "body",dataType = "HouseInfo" )
    @PutMapping("/update")
    public JSONResult update(@RequestBody HouseInfo houseInfo){
        Boolean result = houseInfoService.modifyHouseInfo(houseInfo);
        if (result) {
            return JSONResult.retSuc(200, "修改租房信息成功");
        } else {
            return JSONResult.retSuc(500, "修改租房信息成功");
        }
    }

    @ApiOperation("删除租房信息")
    @ApiImplicitParam(name = "houseId",value = "租房信息编号",required = true,paramType = "path",dataType = "int" )
    @DeleteMapping("/delete/{houseId}")
    public JSONResult del(@PathVariable("houseId")Integer houseId){
        Boolean result = houseInfoService.delHouseInfo(houseId);
        if (result) {
            return JSONResult.retSuc(200, "删除租房信息成功");
        } else {
            return JSONResult.retSuc(500, "删除租房信息成功");
        }
    }
}

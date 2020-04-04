package com.rental.rental_info_sys.controller;

import com.rental.rental_info_sys.service.HouseTypeService;
import com.rental.rental_info_sys.util.JSONResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 12030
 * @version V1.0
 * @ProjectName:IntelliJ IDEA
 * @PackageName: com.rental.rental_info_sys.controller
 * @ClassName: HouseTypeController
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @date 2020/3/12 22:49
 * @Copyright 迷笛age版权所有
 */
@RestController
@RequestMapping("/type")
@Api(tags = {"房屋类型信息接口"})
public class HouseTypeController {
    @Autowired
    private HouseTypeService houseTypeService;


    @ApiOperation("获取所有房屋类型信息")
    @GetMapping("/typeList")
    public JSONResult getTypeList(){
        return JSONResult.retSuc(houseTypeService.selectAllHouseType());
    }



}

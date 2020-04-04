package com.rental.rental_info_sys.service;

import com.github.pagehelper.PageInfo;
import com.rental.rental_info_sys.domain.HouseInfo;

import java.util.List;

/**
 * @author 12030
 * @version V1.0
 * @ProjectName:IntelliJ IDEA
 * @PackageName: com.rental.rental_info_sys.service
 * @ClassName: HouseInfoService
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @date 2020/3/12 22:33
 * @Copyright 迷笛age版权所有
 */
public interface HouseInfoService {
    PageInfo<HouseInfo> findAllHouseInfo(int page,int size);

    Boolean addHouseInfo(HouseInfo houseInfo);

    Boolean modifyHouseInfo(HouseInfo houseInfo);

    HouseInfo findOneHouseInfo(Integer houseId);
    Boolean delHouseInfo(Integer houseId);
}

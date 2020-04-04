package com.rental.rental_info_sys.service;

import com.rental.rental_info_sys.domain.HouseType;

import java.util.List;

/**
 * @author 12030
 * @version V1.0
 * @ProjectName:IntelliJ IDEA
 * @PackageName: com.rental.rental_info_sys.service
 * @ClassName: HouseTypeServcie
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @date 2020/3/12 22:33
 * @Copyright 迷笛age版权所有
 */
public interface HouseTypeService {
    List<HouseType> selectAllHouseType();

    HouseType selectOneHouseTypeById(Integer typeId);
}

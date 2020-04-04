package com.rental.rental_info_sys.service.impl;

import com.rental.rental_info_sys.dao.HouseTypeDao;
import com.rental.rental_info_sys.domain.HouseType;
import com.rental.rental_info_sys.service.HouseTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 12030
 * @version V1.0
 * @ProjectName:IntelliJ IDEA
 * @PackageName: com.rental.rental_info_sys.service.impl
 * @ClassName: HouseTypeServiceImpl
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @date 2020/3/12 22:36
 * @Copyright 迷笛age版权所有
 */
@Service
public class HouseTypeServiceImpl implements HouseTypeService {

    @Resource
    private HouseTypeDao houseTypeDao;

    @Override
    public List<HouseType> selectAllHouseType() {
        return houseTypeDao.selectAllHouseType();
    }

    @Override
    public HouseType selectOneHouseTypeById(Integer typeId) {
        return houseTypeDao.selectOneHouseTypeById(typeId);
    }
}

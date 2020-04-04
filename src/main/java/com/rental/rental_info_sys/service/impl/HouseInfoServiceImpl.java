package com.rental.rental_info_sys.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.rental.rental_info_sys.dao.HouseInfoDao;
import com.rental.rental_info_sys.domain.HouseInfo;
import com.rental.rental_info_sys.service.HouseInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 12030
 * @version V1.0
 * @ProjectName:IntelliJ IDEA
 * @PackageName: com.rental.rental_info_sys.service.impl
 * @ClassName: HouseInfoServiceImpl
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @date 2020/3/12 22:34
 * @Copyright 迷笛age版权所有
 */
@Service
public class HouseInfoServiceImpl implements HouseInfoService {
  @Resource
  private HouseInfoDao houseInfoDao;

    @Override
    public PageInfo<HouseInfo> findAllHouseInfo(int page,int size) {
        PageHelper.startPage(page, size);
        List<HouseInfo> houseInfos = houseInfoDao.selectAllHouseInfo();
        return new PageInfo<>(houseInfos);
    }

    @Override
    public Boolean modifyHouseInfo(HouseInfo houseInfo) {
        return houseInfoDao.updateHouseInfo(houseInfo)>0;
    }

    @Override
    public Boolean delHouseInfo(Integer houseId) {
        return houseInfoDao.deleteHouseInfo(houseId)>0;
    }

    @Override
    public Boolean addHouseInfo(HouseInfo houseInfo) {
        return houseInfoDao.insertHouseInfo(houseInfo)>0;
    }

    @Override
    public HouseInfo findOneHouseInfo(Integer houseId) {
        return houseInfoDao.selectOneHouseInfo(houseId);
    }
}

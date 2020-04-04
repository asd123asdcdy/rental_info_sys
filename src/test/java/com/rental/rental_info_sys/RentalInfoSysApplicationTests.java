package com.rental.rental_info_sys;

import com.rental.rental_info_sys.domain.HouseInfo;
import com.rental.rental_info_sys.domain.HouseType;
import com.rental.rental_info_sys.service.HouseInfoService;
import com.rental.rental_info_sys.service.HouseTypeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

@SpringBootTest
class RentalInfoSysApplicationTests {

    @Autowired
    HouseTypeService houseTypeService;

    @Autowired
    HouseInfoService houseInfoService;

    @Test
    void contextLoads() {
//        HouseInfo houseInfo=new HouseInfo();
//        houseInfo.setTypeId(2);
//        houseInfo.setHouseId(12);
//        houseInfo.setHouseDesc("哈佛国际精装楼带院长期租包");
//        houseInfo.setMonthlyRent(3500);
//        Boolean aBoolean = houseInfoService.modifyHouseInfo(houseInfo);
//        System.out.println(aBoolean);
        BigDecimal bigDecimal = BigDecimal.valueOf(2222);
        BigDecimal big=new BigDecimal(111);

        Boolean aBoolean = houseInfoService.delHouseInfo(13);
        System.out.println(aBoolean);
    }

}

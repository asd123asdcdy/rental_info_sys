package com.rental.rental_info_sys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.rental.rental_info_sys.dao")
public class RentalInfoSysApplication {

    public static void main(String[] args) {
        SpringApplication.run(RentalInfoSysApplication.class, args);
    }

}

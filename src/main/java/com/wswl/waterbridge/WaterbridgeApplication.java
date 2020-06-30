package com.wswl.waterbridge;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan({"com.wswl.waterbridge.mapper","com.wswl.waterbridge.dto"})
@SpringBootApplication
public class WaterbridgeApplication {

    public static void main(String[] args) {
        SpringApplication.run(WaterbridgeApplication.class, args);
    }

}

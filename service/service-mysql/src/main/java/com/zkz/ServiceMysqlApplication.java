package com.zkz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.zkz.mapper")
public class ServiceMysqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceMysqlApplication.class, args);
    }

}


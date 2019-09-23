package com.coolsen;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.coolsen.mapper")
@SpringBootApplication
public class SpringBootMybatisPlusDubboZookeeperServiceImplApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMybatisPlusDubboZookeeperServiceImplApplication.class, args);
    }
}

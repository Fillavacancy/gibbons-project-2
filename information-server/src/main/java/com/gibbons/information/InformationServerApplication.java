package com.gibbons.information;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@MapperScan("com.gibbons.information.mapper")
public class InformationServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(InformationServerApplication.class, args);
    }
}

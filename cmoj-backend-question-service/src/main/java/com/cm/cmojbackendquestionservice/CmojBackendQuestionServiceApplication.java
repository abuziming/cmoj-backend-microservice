package com.cm.cmojbackendquestionservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.cm.cmojbackendquestionservice.mapper")
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@ComponentScan("com.cm")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.cm.cmojbackendserviceclient.service"})
public class CmojBackendQuestionServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CmojBackendQuestionServiceApplication.class, args);
    }

}

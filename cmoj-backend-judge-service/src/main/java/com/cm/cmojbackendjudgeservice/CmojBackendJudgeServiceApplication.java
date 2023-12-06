package com.cm.cmojbackendjudgeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

@SpringBootApplication
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@ComponentScan("com.cm")
@EnableDiscoveryClient
@EnableSwagger2WebMvc
@EnableFeignClients(basePackages = {"com.cm.cmojbackendserviceclient.service"})
public class CmojBackendJudgeServiceApplication {

    public static void main(String[] args)   {
        SpringApplication.run(CmojBackendJudgeServiceApplication.class, args);
    }

}

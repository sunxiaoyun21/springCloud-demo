package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author 孙小云
 * @version 1.0
 * @date 2019/8/1 16:28
 **/
@SpringBootApplication
@EnableEurekaServer // EurekaServer服务器端启动类,接受其它微服务注册进来
public class EurekaServer7003 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7003.class, args);
    }
}

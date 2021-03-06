package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-06-16 16:30
 * 主启动类
 * 1.建module
 * 2.改pom
 * 3.写yml
 * 4.主启动类
 * 5.业务类
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8001.class, args);
        System.out.println("PaymentMain8001微服务启动");
    }
}
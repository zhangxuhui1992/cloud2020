package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-06-20 8:06
 * EnableDiscoveryClient 该注解用于向consul和zookeeper作为注册中心时注册服务
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8004 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8004.class, args);
    }
}

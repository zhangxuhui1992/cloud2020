package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-06-24 14:22
 */
@SpringBootApplication
@EnableEurekaClient
public class MQConsumerMain8803 {
    public static void main(String[] args) {
        SpringApplication.run(MQConsumerMain8803.class, args);
    }
}

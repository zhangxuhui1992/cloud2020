package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-06-24 14:09
 */
@SpringBootApplication
@EnableEurekaClient
public class MQConsumerMain8802 {
    public static void main(String[] args) {
        SpringApplication.run(MQConsumerMain8802.class, args);
    }
}

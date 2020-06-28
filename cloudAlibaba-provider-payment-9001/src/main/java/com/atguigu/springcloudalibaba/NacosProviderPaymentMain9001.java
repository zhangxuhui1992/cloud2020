package com.atguigu.springcloudalibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-06-24 16:14
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosProviderPaymentMain9001 {
    public static void main(String[] args) {
        SpringApplication.run(NacosProviderPaymentMain9001.class, args);
    }
}

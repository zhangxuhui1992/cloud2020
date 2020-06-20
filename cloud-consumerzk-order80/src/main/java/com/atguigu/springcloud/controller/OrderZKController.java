package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-06-20 8:52
 */
@RestController
@Slf4j
public class OrderZKController {

    @Autowired
    RestTemplate restTemplate;

    public static final String INVOKE_URL="http://springcloud-provider-payment";

    @GetMapping("/consumer/payment/zk")
    public String payment (){
        String result = restTemplate.getForObject(INVOKE_URL+"/payment/zk",String.class);
        return result;
    }

}

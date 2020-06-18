package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-06-18 10:41
 */
@Configuration
public class ApplicationContextConfig {

    /**
     * 给容器中添加组价
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate getRestTempate(){
        return new RestTemplate();
    }
}

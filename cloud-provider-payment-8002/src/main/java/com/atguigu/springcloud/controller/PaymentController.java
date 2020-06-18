package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import com.netflix.appinfo.InstanceInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-06-16 19:56
 */
@RestController
@Slf4j
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @Value("${server.port}")
    private String ServerPort;

    @Resource
    DiscoveryClient discoveryClient;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("******插入结果"+result);
        if(result > 0 ){
            return new CommonResult(200,"数据库添加成功,ServerPort："+ServerPort,result);
        }else{
            return new CommonResult(501,"数据库添加失败",null);
        }
    }


    @GetMapping("/payment/get/{id}")
    public CommonResult getPymentById(@PathVariable("id")long id){
        Payment dto = paymentService.getPymentById(id);
        log.info("******查询结果"+dto);
        if(dto != null ){
            return new CommonResult(200,"数据库查询成功，ServerPort："+ServerPort,dto);
        }else{
            return new CommonResult(502,"数据库查询失败，查询id"+id,null);
        }
    }

    @GetMapping("/payment/discovery")
    public Object discovery(){
        List<ServiceInstance> list = discoveryClient.getInstances("SPRINGCLOUD-PAYMENT-SERVICE");
        for(ServiceInstance info : list){
            log.info("****"+info.getUri());
        }
        return this.discoveryClient;
    }

}

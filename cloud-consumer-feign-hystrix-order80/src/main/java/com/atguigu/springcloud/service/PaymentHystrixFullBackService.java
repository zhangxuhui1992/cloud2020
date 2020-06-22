package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-06-22 16:00
 */
@Component
public class PaymentHystrixFullBackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK , (┬＿┬)";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut , (┬＿┬)";
    }
}

package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-06-16 17:48
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPymentById(@Param("id")long id);
}

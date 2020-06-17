package com.atguigu.springcloud.dao;


import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-06-16 17:01
 */
@Mapper
public interface PaymentMapper {

    public int create(Payment payment);

    public Payment getPymentById(@Param("id")long id);

}

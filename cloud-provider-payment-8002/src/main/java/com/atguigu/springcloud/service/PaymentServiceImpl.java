package com.atguigu.springcloud.service;

import com.atguigu.springcloud.dao.PaymentMapper;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-06-16 17:49
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    PaymentMapper paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPymentById(long id) {
        return paymentDao.getPymentById(id);
    }
}

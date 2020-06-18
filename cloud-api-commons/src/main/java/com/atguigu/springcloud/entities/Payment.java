package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-06-18 10:35
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {

    private long id;
    private String serial;

}
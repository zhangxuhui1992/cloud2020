package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-06-18 10:36
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult <T>{

    private Integer code;
    private String message;
    private T data;

    /**
     * 没有数据的构造器
     * @param code
     * @param message
     */
    public CommonResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}

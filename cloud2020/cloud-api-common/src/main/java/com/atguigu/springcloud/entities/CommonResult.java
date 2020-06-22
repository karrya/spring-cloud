package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lk
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    //信息码
    private Integer code;

    //信息
    private String message;

    //数据
    private  T data;

    public CommonResult(Integer code, String message){
        this(code,message,null);
    }
}

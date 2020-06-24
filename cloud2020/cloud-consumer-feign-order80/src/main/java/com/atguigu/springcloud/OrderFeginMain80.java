package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * <h3>cloud2020</h3>
 *
 * @author : Likai
 * @date : 2020-06-24 09:43
 **/
@SpringBootApplication
@EnableFeignClients  //使用Feign并开启Feign
public class OrderFeginMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeginMain80.class,args);
    }
}

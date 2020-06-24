package com.atguigu.springcolud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <h3>cloud2020</h3>
 *
 * @author : Likai
 * @date : 2020-06-19 11:24
 **/
@SpringBootApplication
@EnableDiscoveryClient //该注释用于想使用向使用Consul或者Zookeeper作为注册中心时注册服务
public class OrderZKMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderZKMain80.class,args);
    }
}

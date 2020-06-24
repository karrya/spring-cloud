package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * <h3>cloud2020</h3>
 *
 * @author : Likai
 * @date : 2020-06-23 11:16
 **/
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced //实现多服务注册的负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}

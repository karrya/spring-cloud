package com.atguigu.springcolud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author lk
 */

@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced //保证其轮训方式，负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}

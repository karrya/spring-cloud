package com.atguigu.springcolud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * <h3>cloud2020</h3>
 *
 * @author : Likai
 * @date : 2020-06-19 11:28
 **/
@RestController
@Slf4j
public class OrderZkController {

    @Resource
    private RestTemplate restTemplate;

    public static  final String INVOKE_URL ="http://cloud-provider-payment";

    @GetMapping(value = "/consumer/payment/zk")
    public String paymentInfo(){
        String result = restTemplate.getForObject(INVOKE_URL+"/payment/zk",String.class);
        return result;
    }

}

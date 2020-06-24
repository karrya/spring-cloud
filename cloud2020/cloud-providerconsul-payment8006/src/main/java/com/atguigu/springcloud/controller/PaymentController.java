package com.atguigu.springcloud.controller;

import cn.hutool.core.lang.UUID;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <h3>cloud2020</h3>
 *
 * @author : Likai
 * @date : 2020-06-23 10:05
 **/
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "/payment/consul")
    public String paymentConsul(){
        return "SpringCloud with Consul:"+serverPort+"\t"+ UUID.randomUUID().toString();
    }
}

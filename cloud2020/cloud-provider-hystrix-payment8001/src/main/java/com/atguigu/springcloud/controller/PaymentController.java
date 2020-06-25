package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <h3>cloud2020</h3>
 *
 * @author : Likai
 * @date : 2020-06-24 14:34
 **/
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    //***************************服务降级***********************//

    @GetMapping(value = "/payment/hystrix/ok/{id}")
    public String paymentInfo_Ok(@PathVariable("id")Integer id){
        String result = paymentService.paymentInfo_Ok(id);
         log.info("************result: " + result);
         return result;
    }

    @GetMapping(value = "/payment/hystrix/timeout/{id}")
    public String paymentInfo_TimeOut(@PathVariable("id")Integer id){
        String result = paymentService.paymentInfo_TimeOut(id);
        log.info("************result: " + result);
        return result;
    }

    //***************************服务熔断***********************//
    @GetMapping(value = "/payment/cricuit/{id}")
    public String paymentCricuitBreak(@PathVariable("id")Integer id){
        String result = paymentService.paymentCricuitBreak(id);
        log.info("%%%%%%%%%%%%%% reslut: "+result);
        return result;
    }

}

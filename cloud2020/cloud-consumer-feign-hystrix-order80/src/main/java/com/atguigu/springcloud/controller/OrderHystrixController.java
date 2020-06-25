package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.PaymentHystrixService;
import com.atguigu.springcloud.service.UP_PaymentHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <h3>cloud2020</h3>
 *
 * @author : Likai
 * @date : 2020-06-24 15:32
 **/
@RestController
@Slf4j
@DefaultProperties(defaultFallback = "payment_Global_FallBack")
public class OrderHystrixController {

    @Resource
    //private PaymentHystrixService paymentHystrixService;

    private UP_PaymentHystrixService paymentHystrixService;
    /**
     * 正常访问
     *
     * @param id
     * @return
     */
    @GetMapping("/consume/payment/hystrix/ok/{id}")
    String paymentInfo_OK(@PathVariable("id") Integer id){
        return paymentHystrixService.paymentInfo_OK(id);
    }

    /**
     * 超时访问
     *
     * @param id
     * @return
     */
    /*@HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler",
            commandProperties = {@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "5000")})*/
    @GetMapping("/consume/payment/hystrix/timeout/{id}")
    @HystrixCommand
    String paymentInfo_TimeOut(@PathVariable("id") Integer id){
        int i = 10 /0 ;
        return paymentHystrixService.paymentInfo_TimeOut(id);
    }

    public String paymentInfo_TimeOutHandler(Integer id){
        return "我是消费者80，现在系统繁忙，请10秒后重试"+"！！！！！！！^_^！！！！！！";
    }

    /**
     * 全局服务降级 @DefaultProperties(defaultFallback = "")
     * @return
     */
    public String payment_Global_FallBack(){
        return "全局的服务降级方法，在此可以处理很多方法！";
    }
}

package com.atguigu.springcloud.service;

import org.springframework.stereotype.Service;

/**
 * <h3>cloud2020</h3>
 *
 * @author : Likai
 * @date : 2020-06-24 14:26
 **/
public interface PaymentService {

    //***************************服务降级***********************//

    public String paymentInfo_Ok(Integer id);

    public String paymentInfo_TimeOut(Integer id);

    //***************************服务熔断***********************//

    public String paymentCricuitBreak(Integer id);

}

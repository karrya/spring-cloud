package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.service.UP_PaymentHystrixService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * <h3>cloud2020</h3>
 *
 * @author : Likai
 * @date : 2020-06-24 17:57
 **/
@Component
public class UP_PaymentHystrixServiceImpl implements UP_PaymentHystrixService {

    @Override
    public String paymentInfo_OK(Integer id) {
        return "-------UP_PaymentHystrixServiceImpl fall back，paymentInfo_OK,(#^.^#)";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-------UP_PaymentHystrixServiceImpl fall back，paymentInfo_TimeOut,o(╥﹏╥)o";
    }
}

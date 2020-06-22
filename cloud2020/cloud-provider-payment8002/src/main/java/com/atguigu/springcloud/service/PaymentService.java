package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author lk
 */
public interface PaymentService {

    /**
     * 插入
     * @param payment 实体对象
     * @return
     */
    public int create(Payment payment);


    /**
     * 按id查找
     * @param id id
     * @return
     */
    public Payment getPaymentById(Long id);
}

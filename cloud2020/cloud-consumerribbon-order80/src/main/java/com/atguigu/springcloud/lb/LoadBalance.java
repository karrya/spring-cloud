package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * <h3>cloud2020</h3>
 *
 * @author : Likai
 * @date : 2020-06-23 23:29
 **/
public interface LoadBalance {
    ServiceInstance instance(List<ServiceInstance> serviceInstances);
}

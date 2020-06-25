package com.atguigu.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <h3>cloud2020</h3>
 *
 * @author : Likai
 * @date : 2020-06-25 09:08
 **/
@Configuration
public class GatewayConfig {

    /**
     * 测试代码形式进行路由转发
     * 测试：http://localhost:9527/guonei ==
     * @param routeLocatorBuilder
     * @return
     */
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder){
        //可以类似于application.yml 中的 routes
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();

        routes.route("path_route_atguigu",r->r.path("/guonei").uri("http://news.baidu.com/guonei"))
                .route("",r->r.path("/finance").uri("http://news.baidu.com/finance"));
        return routes.build();
    }
}

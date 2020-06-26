package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <h3>cloud2020</h3>
 *
 * @author : Likai
 * @date : 2020-06-25 15:57
 **/
@RestController
@RefreshScope
public class ConfigClientConroller {

    @Value("${config.info}")
    private String configInfo;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/configIngo")
    public String getConfigInfo(){
        return "configInfo: "+configInfo+"\t\n\n"+"serverPort: "+serverPort;
    }

}

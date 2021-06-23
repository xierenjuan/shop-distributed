package com.provider.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: LongYao
 * @Date: 2021/6/18 9:45
 */
@RestController
@Api(value = "商品服务提供者")
public class ProviderController {
    @Value("${server.port}")
    private String port;

    @ApiOperation(value = "get接口")
    @GetMapping(value = "/provider/get")
    public String get(String id){
        return port;
    }

    @ApiOperation(value = "feignTimeOut")
    @GetMapping(value = "/provider/feignTimeOut/{id}")
    public String feignTimeOut(@PathVariable("id") String id){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return port;
    }

    @ApiOperation(value = "feign")
    @GetMapping(value = "/provider/feign/{id}")
    String feign(@PathVariable("id")String id){
        return port;
    }

}

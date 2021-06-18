package com.consumer.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: LongYao
 * @Date: 2021/6/18 9:45
 */
@RestController
@Api(value = "商品服务消费者")
public class ConsumerController {
    @Value("${server.port}")
    private String port;
    @Autowired
    private RestTemplate restTemplate;

    private String url = "http://shop-provider";

    @ApiOperation(value = "get接口")
    @GetMapping(value = "/consumer/get")
    public String get(String id){
        return port;
    }

    @ApiOperation(value = "fromProvider")
    @GetMapping(value = "/consumer/fromProvider")
    public String fromProvider(String id){
        return restTemplate.getForObject(url + "/provider/get", String.class);
    }
}
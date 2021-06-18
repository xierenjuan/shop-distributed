package com.provider.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
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
}

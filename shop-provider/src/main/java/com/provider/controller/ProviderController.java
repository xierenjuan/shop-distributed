package com.provider.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
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
    public String feign(@PathVariable("id")String id){
        return port;
    }

    @ApiOperation(value = "hystrix")
    @GetMapping(value = "/provider/hystrix/{id}")
    public String hystrix(@PathVariable("id")String id){
        return port;
    }

    @HystrixCommand(fallbackMethod = "providerTimeOutHandler",commandProperties = {
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="3000")
    })
    @ApiOperation(value = "hystrix超时")
    @GetMapping(value = "/provider/hystrixTime/{id}")
    public String hystrixTime(@PathVariable("id")String id){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return port;
    }

    @HystrixCommand(fallbackMethod = "providerExceptionHandler",commandProperties = {
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="3000")
    })
    @ApiOperation(value = "hystrix异常")
    @GetMapping(value = "/provider/hystrixEx/{id}")
    public String hystrixEx(@PathVariable("id")String id){
        int i = 1/0;
        return port;
    }


    @HystrixCommand(fallbackMethod = "providerCircuitHandler",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"),
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60"),
    })
    @ApiOperation(value = "hystrix熔断")
    @GetMapping(value = "/provider/hystrixCircuit/{id}")
    public String hystrixCircuit(@PathVariable("id")String id){
        Integer i = Integer.valueOf(id);
        if(i < 0)
        {
            System.out.println("id : " + i);
            throw new RuntimeException("******id 不能负数");
        }
        return port;
    }




    public String providerCircuitHandler(String id){
        return "熔断--导致服务降级";
    }
    public String providerExceptionHandler(String id){
        return "异常--导致服务降级";
    }
    public String providerTimeOutHandler(String id){
        return "超时--导致服务降级";
    }
}

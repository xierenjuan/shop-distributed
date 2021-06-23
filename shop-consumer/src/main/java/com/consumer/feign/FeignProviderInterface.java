package com.consumer.feign;

import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author: LongYao
 * @Date: 2021/6/18 16:06
 */
@FeignClient(name = "shop-provider")
@Component
public interface FeignProviderInterface {

    @GetMapping(value = "/provider/feignTimeOut/{id}")
    String feignTimeOut(@PathVariable("id")String id);

    @GetMapping(value = "/provider/feign/{id}")
    String feign(@PathVariable("id")String id);

    @GetMapping(value = "/provider/hystrix/{id}")
    public String hystrix(@PathVariable("id")String id);

    @GetMapping(value = "/provider/hystrixTime/{id}")
    public String hystrixTime(@PathVariable("id")String id);

    @GetMapping(value = "/provider/hystrixEx/{id}")
    public String hystrixEx(@PathVariable("id")String id);

    @ApiOperation(value = "hystrix熔断")
    @GetMapping(value = "/provider/hystrixCircuit/{id}")
    public String hystrixCircuit(@PathVariable("id")String id);
}

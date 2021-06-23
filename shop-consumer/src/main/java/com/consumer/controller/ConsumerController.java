package com.consumer.controller;

import com.consumer.ervice.LoadBalancer;
import com.consumer.feign.FeignProviderInterface;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.net.URI;
import java.util.List;

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
    //可以获取注册中心上的服务列表
    @Resource
    private DiscoveryClient discoveryClient;
    @Resource
    private LoadBalancer loadBalancer;
    @Autowired
    private FeignProviderInterface  feignProviderInterface;

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

    @ApiOperation(value = "手动实现负载均衡调提供者")
    @GetMapping("/consumer/lb")
    public String getPaymentLB()
    {
        List<ServiceInstance> instances = discoveryClient.getInstances("shop-provider");

        if(instances == null || instances.size()<=0) {
            return null;
        }
        ServiceInstance serviceInstance = loadBalancer.instances(instances);
        URI uri = serviceInstance.getUri();

        return restTemplate.getForObject(uri+"/provider/get",String.class);
    }

    @ApiOperation(value = "消费者使用feign调用提供者(超时)")
    @GetMapping(value = "/consumer/feignTimeOut/{id}")
    public String feignTimeOut(@PathVariable("id") String id){
        return  feignProviderInterface.feignTimeOut(id);
    }
}
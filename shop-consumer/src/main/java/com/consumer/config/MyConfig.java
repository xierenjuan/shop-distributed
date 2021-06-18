package com.consumer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: LongYao
 * @Date: 2021/6/18 10:59
 */
@Configuration
public class MyConfig {

    /**
     * 配置bean,实现负载均衡
     * @return
     */
    @LoadBalanced
    @Bean
    public RestTemplate getRestTemplate(){
        return  new RestTemplate();
    }

}

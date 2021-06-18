package com.consumer.config;

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
//    @LoadBalanced // 如果有自定义的负载均衡策略需要注释
    @Bean
    public RestTemplate getRestTemplate(){
        return  new RestTemplate();
    }

}

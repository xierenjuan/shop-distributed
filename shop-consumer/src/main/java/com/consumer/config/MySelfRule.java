package com.consumer.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: LongYao
 * @Date: 2021/6/18 15:34
 */

/**
 * 1、自定义负载均衡规则
 * 2、在主启动：@RibbonClient(name = "shop-provider",configuration = MySelfRule.class)
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule(){
        return new RandomRule();//定义为随机
    }

}

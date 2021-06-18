package com.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.oas.annotations.EnableOpenApi;

/**
 * @Author: LongYao
 * @Date: 2021/6/18 10:23
 */
@SpringBootApplication
@EnableOpenApi
@EnableEurekaClient
@EnableFeignClients
//@RibbonClient(name = "shop-provider",configuration = MySelfRule.class)
public class ShopConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShopConsumerApplication.class, args);
    }
}

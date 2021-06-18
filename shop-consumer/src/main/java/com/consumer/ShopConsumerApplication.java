package com.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import springfox.documentation.oas.annotations.EnableOpenApi;

/**
 * @Author: LongYao
 * @Date: 2021/6/18 10:23
 */
@SpringBootApplication
@EnableOpenApi
@EnableEurekaClient
public class ShopConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShopConsumerApplication.class, args);
    }
}

package com.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import springfox.documentation.oas.annotations.EnableOpenApi;

/**
 * @Author: LongYao
 * @Date: 2021/6/18 9:43
 */
@SpringBootApplication
@EnableOpenApi
@EnableEurekaClient
@EnableCircuitBreaker
public class ShopProvider2000Application {
    public static void main(String[] args) {
        SpringApplication.run(ShopProvider2000Application.class, args);
    }
}

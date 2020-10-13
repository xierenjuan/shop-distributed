package com.test.maven.api;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component
public class MyFallBack implements UserApi{

    @Override
    public Object get(Long id) {
        System.out.println("fallback============");
        return null;
    }
}

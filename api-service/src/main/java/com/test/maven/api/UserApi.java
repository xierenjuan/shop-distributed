package com.test.maven.api;

import com.test.maven.api.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(value = "user-service", url = "",configuration = FeignConfig.class/*, fallback = MyFallBack.class*/)
public interface UserApi {

    @RequestMapping(value = "get", method = RequestMethod.GET)
    Object get(@RequestParam("id") Long id);

}

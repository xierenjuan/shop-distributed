package com.test.maven.api;

import com.test.common.dto.GoodsDto;
import com.test.maven.api.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Component
@FeignClient(value = "goods-service", url = "",configuration = FeignConfig.class)
public interface GoodsApi {

    @RequestMapping(value = "list", method = RequestMethod.GET)
    List<GoodsDto> list(@RequestParam("i") int i);

}

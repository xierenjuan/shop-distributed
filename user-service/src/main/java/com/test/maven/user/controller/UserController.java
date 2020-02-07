package com.test.maven.user.controller;

import com.test.common.result.CommonResult;
import com.test.maven.api.OrderApi;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("用户相关")
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private OrderApi orderApi;

    @ApiOperation("测试用户服务调用订单服务")
    @GetMapping("test")
    public CommonResult<Object> test(){
        return CommonResult.getSucceedInstance(orderApi.get(1L));
    }
}

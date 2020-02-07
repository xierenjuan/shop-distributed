package com.test.maven.order.controller;


import com.test.common.result.CommonResult;
import com.test.maven.api.UserApi;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("订单相关")
@RestController
@RequestMapping("order")
public class OrderController {
    @Autowired
    private UserApi userApi;

    @ApiOperation("测试订单服务调用用户服务")
    @GetMapping("/test")
    public CommonResult<Object> test(){
        return CommonResult.getSucceedInstance(userApi.get(1L));
    }

}

package com.test.maven.order.controller;


import com.test.common.result.CommonResult;
import com.test.maven.order.service.OrderService;
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
    private OrderService orderService;

    @ApiOperation("查询数据库")
    @GetMapping("/queryDatabase")
    public CommonResult<Object> queryDatabase(){
        return CommonResult.getSucceedInstance(orderService.list());
    }

}

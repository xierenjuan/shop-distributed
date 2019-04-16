package com.test.maven.order.controller;


import com.test.common.dto.GoodsDto;
import com.test.common.entity.Order;
import com.test.common.result.CommonResult;
import com.test.maven.api.GoodsApi;
import com.test.maven.order.service.OrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@Api("订单相关")
@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    private OrderService orderService;
    @Autowired
    private GoodsApi goodsApi;

    @ApiOperation("订单测试")
    @GetMapping("/test")
    public CommonResult<List<GoodsDto>> test(){
        Order order = new Order();
        order.setId(1L);
        order.setAmount(new BigDecimal("100"));
//        orderService.insert(order);
        List<GoodsDto> list = goodsApi.list(1);
        return CommonResult.getSucceedInstance(list);
    }

    @ApiOperation("订单测试2")
    @GetMapping("/test2")
    public CommonResult<Object> test2(){
        return CommonResult.getSucceedInstance(orderService.list());
    }
}

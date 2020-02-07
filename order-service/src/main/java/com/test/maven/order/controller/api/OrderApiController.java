package com.test.maven.order.controller.api;

import com.test.maven.api.OrderApi;
import com.test.maven.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

@ApiIgnore
@RestController
public class OrderApiController implements OrderApi {

    @Autowired
    private OrderService orderService;

    @Override
    public Object get(Long id) {
        return orderService.list();
    }
}

package com.test.maven.order.server.service;

import com.test.common.entity.Order;

import java.util.List;

public interface OrderService {
    void insert(Order order);

    List<Order> list();
}

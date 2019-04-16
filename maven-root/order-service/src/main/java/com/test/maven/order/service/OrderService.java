package com.test.maven.order.service;

import com.test.common.entity.Order;

import java.util.List;

public interface OrderService {
    void insert(Order order);

    List<Order> list();
}

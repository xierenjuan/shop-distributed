package com.test.maven.order.service.Impl;

import com.test.common.entity.Order;
import com.test.maven.order.dao.OrderMapper;
import com.test.maven.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;

    @Override
    @Transactional
    public void insert(Order order) {
        orderMapper.insert(order);
    }
}

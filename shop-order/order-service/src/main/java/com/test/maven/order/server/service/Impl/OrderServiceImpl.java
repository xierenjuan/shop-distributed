package com.test.maven.order.server.service.Impl;

import com.test.common.entity.Order;
import com.test.common.entity.OrderExample;
import com.test.maven.order.server.dao.OrderMapper;
import com.test.maven.order.server.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;

    @Override
    @Transactional
    public void insert(Order order) {
        orderMapper.insert(order);
    }

    @Override
    public List<Order> list() {

        return orderMapper.selectByExample(new OrderExample());
    }
}

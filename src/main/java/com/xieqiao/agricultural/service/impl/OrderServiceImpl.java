package com.xieqiao.agricultural.service.impl;

import com.xieqiao.agricultural.dao.OrderDao;
import com.xieqiao.agricultural.entity.Order;
import com.xieqiao.agricultural.service.OrderService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderDao dao;
    @Override
    public List<Order> list() { return dao.list(); }
    @Override
    public boolean add(Order order) { return dao.insert(order) > 0; }
}
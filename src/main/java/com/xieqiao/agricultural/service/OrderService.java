package com.xieqiao.agricultural.service;

import com.xieqiao.agricultural.entity.Order;
import java.util.List;

public interface OrderService {
    List<Order> list();
    boolean add(Order order);
}
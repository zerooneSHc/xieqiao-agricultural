package com.xieqiao.agricultural.dao;

import com.xieqiao.agricultural.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface OrderDao {
    List<Order> list();
    int insert(Order order);
}
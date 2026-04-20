package com.xieqiao.agricultural.controller;

import com.xieqiao.agricultural.common.Result;
import com.xieqiao.agricultural.entity.Order;
import com.xieqiao.agricultural.service.OrderService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/order")
public class OrderController {
    @Resource
    private OrderService service;

    @GetMapping("/list")
    public Result<List<Order>> list(){
        return Result.success(service.list());
    }

    @PostMapping("/add")
    public Result<?> add(@RequestBody Order order){
        return service.add(order) ? Result.success() : Result.error("下单失败");
    }
}
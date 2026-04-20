package com.xieqiao.agricultural.entity;

import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class Order {
    private Long id;
    private String orderNo;
    private Long userId;
    private Long productId;
    private Integer num;
    private BigDecimal totalPrice;
    private Integer status;
    private LocalDateTime createTime;
}
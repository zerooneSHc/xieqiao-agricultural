package com.xieqiao.agricultural.entity;

import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class AgriculturalProduct {
    private Long id;
    private String productName;
    private String category;
    private BigDecimal price;
    private Integer stock;
    private String farmerName;
    private String address;
    private Integer status;
    private LocalDateTime createTime;
}
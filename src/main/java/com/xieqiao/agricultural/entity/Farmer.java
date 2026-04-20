package com.xieqiao.agricultural.entity;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class Farmer {
    private Long id;
    private String name;
    private String phone;
    private String address;
    private Integer status;
    private LocalDateTime createTime;
}
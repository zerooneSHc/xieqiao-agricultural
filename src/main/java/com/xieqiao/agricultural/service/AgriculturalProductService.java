package com.xieqiao.agricultural.service;

import com.xieqiao.agricultural.entity.AgriculturalProduct;
import java.util.List;

public interface AgriculturalProductService {
    List<AgriculturalProduct> list();
    AgriculturalProduct getById(Long id);
    boolean add(AgriculturalProduct product);
    boolean update(AgriculturalProduct product);
    boolean delete(Long id);
}
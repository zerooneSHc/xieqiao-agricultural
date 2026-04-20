package com.xieqiao.agricultural.dao;

import com.xieqiao.agricultural.entity.AgriculturalProduct;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface AgriculturalProductDao {
    List<AgriculturalProduct> list();
    AgriculturalProduct getById(Long id);
    int insert(AgriculturalProduct product);
    int update(AgriculturalProduct product);
    int delete(Long id);
}
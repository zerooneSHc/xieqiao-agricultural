package com.xieqiao.agricultural.service.impl;

import com.xieqiao.agricultural.dao.AgriculturalProductDao;
import com.xieqiao.agricultural.entity.AgriculturalProduct;
import com.xieqiao.agricultural.service.AgriculturalProductService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AgriculturalProductServiceImpl implements AgriculturalProductService {
    @Resource
    private AgriculturalProductDao dao;

    @Override
    public List<AgriculturalProduct> list() { return dao.list(); }
    @Override
    public AgriculturalProduct getById(Long id) { return dao.getById(id); }
    @Override
    public boolean add(AgriculturalProduct product) { return dao.insert(product) > 0; }
    @Override
    public boolean update(AgriculturalProduct product) { return dao.update(product) > 0; }
    @Override
    public boolean delete(Long id) { return dao.delete(id) > 0; }
}
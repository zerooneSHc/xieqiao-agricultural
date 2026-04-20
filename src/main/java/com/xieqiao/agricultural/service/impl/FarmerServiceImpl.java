package com.xieqiao.agricultural.service.impl;

import com.xieqiao.agricultural.dao.FarmerDao;
import com.xieqiao.agricultural.entity.Farmer;
import com.xieqiao.agricultural.service.FarmerService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FarmerServiceImpl implements FarmerService {
    @Resource
    private FarmerDao dao;
    @Override
    public List<Farmer> list() { return dao.list(); }
    @Override
    public boolean add(Farmer farmer) { return dao.insert(farmer) > 0; }
}
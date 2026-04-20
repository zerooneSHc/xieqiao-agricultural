package com.xieqiao.agricultural.service;

import com.xieqiao.agricultural.entity.Farmer;
import java.util.List;

public interface FarmerService {
    List<Farmer> list();
    boolean add(Farmer farmer);
}
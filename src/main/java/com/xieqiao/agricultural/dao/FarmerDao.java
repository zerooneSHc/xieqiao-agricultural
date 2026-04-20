package com.xieqiao.agricultural.dao;

import com.xieqiao.agricultural.entity.Farmer;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface FarmerDao {
    List<Farmer> list();
    int insert(Farmer farmer);
}
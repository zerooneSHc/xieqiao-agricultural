package com.xieqiao.agricultural.controller;

import com.xieqiao.agricultural.common.Result;
import com.xieqiao.agricultural.entity.AgriculturalProduct;
import com.xieqiao.agricultural.service.AgriculturalProductService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/product")
public class AgriculturalProductController {
    @Resource
    private AgriculturalProductService service;

    @GetMapping("/list")
    public Result<List<AgriculturalProduct>> list(){
        return Result.success(service.list());
    }

    @GetMapping("/{id}")
    public Result<AgriculturalProduct> get(@PathVariable Long id){
        return Result.success(service.getById(id));
    }

    @PostMapping("/add")
    public Result<?> add(@RequestBody AgriculturalProduct product){
        return service.add(product) ? Result.success() : Result.error("添加失败");
    }

    @PostMapping("/update")
    public Result<?> update(@RequestBody AgriculturalProduct product){
        return service.update(product) ? Result.success() : Result.error("修改失败");
    }

    @GetMapping("/delete/{id}")
    public Result<?> delete(@PathVariable Long id){
        return service.delete(id) ? Result.success() : Result.error("删除失败");
    }
}
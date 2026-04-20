package com.xieqiao.agricultural.controller;

import com.xieqiao.agricultural.common.Result;
import com.xieqiao.agricultural.entity.Farmer;
import com.xieqiao.agricultural.service.FarmerService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/farmer")
public class FarmerController {
    @Resource
    private FarmerService service;

    @GetMapping("/list")
    public Result<List<Farmer>> list(){
        return Result.success(service.list());
    }

    @PostMapping("/add")
    public Result<?> add(@RequestBody Farmer farmer){
        return service.add(farmer) ? Result.success() : Result.error("添加失败");
    }
}
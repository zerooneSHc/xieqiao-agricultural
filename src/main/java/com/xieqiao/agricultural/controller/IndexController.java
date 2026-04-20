package com.xieqiao.agricultural.controller;

import com.xieqiao.agricultural.common.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {
    @GetMapping
    public Result<?> index(){
        return Result.success("斜桥农产品供销系统运行正常 · 端口80 · JDK25");
    }
}
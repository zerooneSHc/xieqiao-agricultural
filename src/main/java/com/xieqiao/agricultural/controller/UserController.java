package com.xieqiao.agricultural.controller;

import com.xieqiao.agricultural.common.Result;
import com.xieqiao.agricultural.entity.User;
import com.xieqiao.agricultural.service.UserService;
import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {
    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    @Resource
    private UserService service;

    @PostMapping("/login")
    public Result<?> login(
            @Valid @RequestParam @NotBlank(message = "用户名不能为空") String username,
            @Valid @RequestParam @NotBlank(message = "密码不能为空") String password) {
        try {
            log.info("用户登录请求：用户名[{}]", username);
            User user = service.login(username, password);
            if (user != null) {
                return Result.success(user, "登录成功");
            } else {
                return Result.error("账号或密码错误，或账号已被禁用");
            }
        } catch (Exception e) {
            log.error("登录异常：用户名[{}]", username, e);
            return Result.error("系统异常，请稍后重试");
        }
    }
}
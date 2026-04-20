package com.xieqiao.agricultural.service;

import com.xieqiao.agricultural.entity.User;

public interface UserService {
    /**
     * 用户登录校验
     * @param username 用户名
     * @param password 明文密码
     * @return 脱敏后的用户信息（无密码）
     */
    User login(String username, String password);
}
package com.xieqiao.agricultural.service.impl;

import com.xieqiao.agricultural.dao.UserMapper;
import com.xieqiao.agricultural.entity.User;
import com.xieqiao.agricultural.service.UserService;
import jakarta.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    @Resource
    private UserMapper userMapper;

    @Override
    public User login(String username, String password) {
        // 1. 根据用户名查询用户（数据库中存储加密后的密码）
        User dbUser = userMapper.selectByUsername(username);
        if (dbUser == null) {
            log.warn("登录失败：用户名[{}]不存在", username);
            return null;
        }

        // 2. 校验用户状态
        if (dbUser.getStatus() != 1) {
            log.warn("登录失败：用户名[{}]已被禁用", username);
            return null;
        }

        // 3. 密码校验（明文密码与加密密码匹配）
        if (!User.matchPassword(password, dbUser.getPassword())) {
            log.warn("登录失败：用户名[{}]密码错误", username);
            return null;
        }

        log.info("用户名[{}]登录成功", username);
        return dbUser;
    }
}
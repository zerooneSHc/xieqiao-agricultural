package com.xieqiao.agricultural.dao;

import com.xieqiao.agricultural.entity.User;

/**
 * 用户数据访问接口（Mapper）
 * 负责user表的数据库操作
 */
public interface UserMapper {
    /**
     * 根据用户名查询用户完整信息
     * @param username 用户名（查询条件）
     * @return 匹配的用户实体（无匹配则返回null）
     */
    User selectByUsername(String username);
}
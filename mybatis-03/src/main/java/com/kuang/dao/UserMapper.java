package com.kuang.dao;

import com.kuang.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * 用户Dao
 * @author hsy
 */
public interface UserMapper {

    /**
     * 获取用户列表
     * @return 用户列表
     */
    List<User> getUserById(int id);

    /**
     * 根据id查询用户
     * @param id 用户id
     * @return 用户对象
     */
}

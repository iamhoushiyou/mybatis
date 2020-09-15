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
     * 根据id查询用户
     * @param id 用户id
     * @return 用户对象
     */
    List<User> getUserById(int id);

    /**
     * 分页查询
     * @param map 包含“start_index” , “pageSize"
     * @return 用户对象
     */
    List<User> getUserByLimit(Map<String,Integer> map);

}

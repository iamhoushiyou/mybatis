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
    List<User> getUserList();

    /**
     * 根据id查询用户
     * @param id 用户id
     * @return 用户对象
     */
    User getUserById(int id);

    /**
     * 增加用户
     * @param user 用户
     * @return
     */
    int addUser(User user);

    /**
     * 修改
     * @param user
     * @return
     */
    int updateUser(User user);

    /**
     * 删除用户
     * @param id 用户id
     * @return 是否成功删除
     */
    int deleteUser(int id);
}

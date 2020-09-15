package com.kuang.dao;

import com.kuang.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * 用户Dao
 * @author hsy
 */
public interface UserMapper {

    @Select("select * from user")
    List<User> getUsers();
    @Select("select * from user where id=#{id}")
    User getUserById(@Param("id") int id);

}

package com.kuang.dao;

import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;


import java.util.HashMap;
import java.util.List;

public class UserDaoTest {

    @Test
    public void test() {
        //第一步：获得SQLSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try {
            //方式一：getMapper
            // UserDao userDao = sqlSession.getMapper(UserDao.class);
            //List<User> userList = userDao.getUserList();
            //方式二：
            List<User> userList = sqlSession.selectList("com.kuang.dao.UserMapper.getUserList");

            for (User user : userList
            ) {
                System.out.println(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void test2() {
        //第一步：获得SQLSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try {
            //方式一：getMapper
            UserMapper userDao = sqlSession.getMapper(UserMapper.class);
            User userById = userDao.getUserById(1);
            List<User> userList = userDao.getUserList();
            for (User user: userList
                 ) {
                System.out.println(user);
            }
            System.out.println(userById);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void addUser(){

        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        try {
            mapper.addUser(new User(6, "hsy1", "hsy'password"));
            //提交事务,不然不会执行
            sqlSession.commit();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            sqlSession.close();
        }
    }

    @Test
    public void TestUpdate(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.updateUser(new User(3, "hsy333", "hsy123"));
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteUserTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.deleteUser(3);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void addUser2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        HashMap<String, Object> map = new HashMap<String, Object>(16);
        map.put("userid",10);
        map.put("username","hsy");
        map.put("password","1234");
        mapper.addUser2(map);

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void getUserById2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String, Object> map = new HashMap<String, Object>(16);
        map.put("id",2);
        map.put("name","lisi");
        User id2 = mapper.getUserById2(map);
        System.out.println(id2);
        sqlSession.close();
    }

    @Test
    public void getUserLike(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> user = mapper.getUserLike("hsy");
        for (User user1 : user) {
            System.out.println(user1);
        }

    }
}

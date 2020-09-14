package com.kuang.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Mybatis工具类
 * @author hsy
 * @date 2020/09/10
 */
public class MybatisUtils {


    /**
     * 默认单例模式
     */
    private static SqlSessionFactory sqlSessionFactory;
    static {
        try{
            //获取sqlSessionFactory对象
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
             sqlSessionFactory= new SqlSessionFactoryBuilder().build(inputStream);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    //既然有SQLSessionFactory，顾名思义，我们就可以从中获得SqlSession的实例，
    //SqlSession完全包含了面向数据库执行sql的所有方法

    /**
     * 获取 SqlSession
     * @return SqlSession
     */
    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }
}

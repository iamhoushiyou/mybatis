# 注解
## 本质是反射机制
## 底层是动态代理

## mybatis详细执行流程！
1.  Resources获取加载全局配置文件
2.  实例化SqlSessionFactoryBuilder构造器
3.  解析文件流XMLConfigBuilder
4.  Configuration所有的配置信息
5.  实例化SQLSessionFactory
6.  transaction事务管理
7.  创建executor执行器
8.  创建sqlSession
9.  实现crud，查看是否成功决定回滚事务或提交事务，最后关闭



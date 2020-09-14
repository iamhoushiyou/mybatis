# 日志
## 1.日志工厂
如果一个数据库操作出现异常，日志是最好的帮手！
*   slf4j
*   log4j(重要)
*   log4j2
*  ...

## 2.Log4j
什么是Log4j？

*   Log4j是Apache的一个开源项目，通过使用Log4j，我们可以控制日志信息输送到
目的地的控制台、文件、GUI组件
*   可以控制每一条日志的输出格式；
*   通过定义每一条日志信息的级别，控制日志的生成过程
*   通过配置文件灵活进行配置，不需要修改应用代码

### 2.1 导入log4j包
~~~pom
<dependency>
        <groupId>log4j</groupId>
        <artifactId>log4j</artifactId>
        <version>1.2.17</version>
</dependency> 
~~~
### 2.2 log4j.properties
```properties
#将等级为DEBUG的日志信息输出到console和file这两个目的地，console和file的定义如下
log4j.rootLogger=Debug, console, file

#控制台输出的相关设置
log4j.appender.console=org.apache.log4j.ConsoleAppender
log4j.appender.console.Target= System.out
log4j.appender.console.Threshold = DEBUG
log4j.appender.console.layout = org.apache.log4j.PatternLayout
log4j.appender.console.layout.ConversionPattern = [%c]-%m%n

#文件输出的相关设置
log4j.appender.file= org.apache.log4j.RollingFileAppender
log4j.appender.file.File = ./log/kuang.log
log4j.appender.file.MaxFileSize = 10mb
log4j.appender.file.Threshold = DEBUG
log4j.appender.file.layout = org.apache.log4j.PatternLayout
log4j.appender.file.layout.Conversionpattern = [%p][%d{yy-MM-dd}][%c]%m%n

#日志输出级别
log4j.logger.org.mybatis = DEBUG
log4j.logger.java.sql=DEBUG
log4j.logger.java.sql.Statement=DEBUG
log4j.logger.java.sql.ResultSet=DEBUG
log4j.logger.java.sql.PreparedStatement=DEBUG

```
### 2.3 配置log4j为日志的实现
```xml
<settings>
        <setting name="logImpl" value="LOG4J"/>
</settings>
```
### 2.4 log4j的使用
测试运行

## 3. Log4j使用

```java
public class UserDaoTest {

   static Logger logger = Logger.getLogger(UserDaoTest.class);
    @Test
    public void testLog4j(){
            logger.info("info:进入了testLog4j");
            logger.debug("debug:进入了testLog4j");
            logger.error("error:进入了testLog4j");
        }
}
```

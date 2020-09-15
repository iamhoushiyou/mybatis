*   mybatis-config.xml
*   User。java
*   UserMapper.java
*   UserMapper.xml

## Lombok
*   java library
*   plugs
*   build tools
*  with one annotation for your class

## 使用步骤
1.  在idea中安装Lombok插件
2.  在项目中导入lombok的jar包
```xml
<dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <version>1.18.10</version>
</dependency>
```
3.  
```java
@Getter and @Setter
@FieldNameConstants
@ToString
@EqualsAndHashCode
@AllArgsConstructor, @RequiredArgsConstructor and @NoArgsConstructor
@Log, @Log4j, @Log4j2, @Slf4j, @XSlf4j, @CommonsLog, @JBossLog, @Flogger, @CustomLog
@Data
@Builder
@SuperBuilder
@Singular
@Delegate
@Value
@Accessors
@Wither
@With
@SneakyThrows
```
常用的@Data，@AllArgsConstructor,@NoArgsConstructor

## 2. 多对一

sql语句
```
CREATE TABLE `teacher`(
`id` INT(10) NOT NULL,
`name` VARCHAR(30) DEFAULT NULL,
PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8

INSERT INTO teacher(`id`,`name`) VALUES(1,'lisi');

CREATE TABLE `student`(
`id` INT(10) not null,
`name` VARCHAR(30) DEFAULT null,
`tid` INT(10) DEFAULT null,
PRIMARY key(`id`),
key `fktid`(`tid`),
CONSTRAINT `fktid` FOREIGN KEY (`tid`) REFERENCES `teacher`(`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8

insert into `student`(id,name,tid) VALUES ('1','xiaohong','1');
insert into `student`(id,name,tid) VALUES ('2','xiaoming','1');
insert into `student`(id,name,tid) VALUES ('3','xiaozhang','1');
insert into `student`(id,name,tid) VALUES ('4','xiaoli','1');
insert into `student`(id,name,tid) VALUES ('5','xiaowang','1');
```
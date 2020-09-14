**javabean和数据库字段不对对应**
*  起别名
   ~~~xml
    <select id="getUserById" resultType="User">
               select id, name, pwd as password from user where id=#{id}
       </select>
*   resultMap
    
    结果集映射
    ~~~xml
    <resultMap id="userMap" type="user">
    <!--        column数据库中的字段，property javabean属性-->
       如果映射一样就不用映射了    
       <!-- <result column="id" property="id"/>
            <result column="name" property="name"/> -->
            <result column="pwd" property="password"/>
    </resultMap>
    
    <select id="getUserById" resultMap="userMap">
            select * from user where id=#{id}
    </select>



    

    

 
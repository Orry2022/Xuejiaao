package com.example.flight.mapper;


import com.example.flight.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * User类的映射对象，专门对user表进行增删改查
 */
public interface UserMapper{

    //查询所有的用户
    @Select("SELECT * FROM user")
    //记录自动变对象 mybatis
    public List<User> selectLiST();

    //根据用户名查询用户
    @Select("SELECT * FROM user WHERE name = #{username}")
    public User selectByUsername(String Username);

    //登录
    @Select("SELECT * FROM user WHERE name = #{username} AND password = #{password}")
    public User selectLogin(
            @Param("username") String name ,//username 必须要加双引号
            @Param("password") String password);
}

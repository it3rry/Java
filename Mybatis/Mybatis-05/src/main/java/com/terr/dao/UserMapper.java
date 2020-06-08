package com.terr.dao;

import com.terr.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

//dao等价与mapper
public interface UserMapper {

    @Select("select * from user")
    List<User> getUsers();

    @Insert("insert into user (id, name, pwd) values (#{id}, #{name}, #{password})")
    int addUser(User user);

    @Update("update user set user=#{user}, pwd=#{password}, where id=#{id}")
    int updateUser(User user);
}

package com.terr.dao;

import com.terr.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//dao等价与mapper
public interface UserMapper {

    @Select("select * from user")
    List<User> getUsers();


}

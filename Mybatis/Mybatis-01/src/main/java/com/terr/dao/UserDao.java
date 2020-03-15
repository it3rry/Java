package com.terr.dao;

import com.terr.pojo.User;

import java.util.List;

//dao等价与mapper
public interface UserDao {
    //查询全部用户
    List<User> getUserList();

    //根据ID查询
    User getUserById(int id);

}

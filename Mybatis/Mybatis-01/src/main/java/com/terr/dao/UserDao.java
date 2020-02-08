package com.terr.dao;

import com.terr.pojo.User;

import java.util.List;

//dao等价与mapper
public interface UserDao {
    List<User> getUserList();

}

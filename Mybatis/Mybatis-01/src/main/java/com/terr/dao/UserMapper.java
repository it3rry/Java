package com.terr.dao;

import com.terr.pojo.User;

import java.util.List;

//dao等价与mapper
public interface UserMapper {
    //查询全部用户
    List<User> getUserList();

    //根据ID查询
    User getUserById(int id);

    //insert一个用户
    int addUser(User user);

    //修改用户
    int updateUser(User user);

    //删除一个用户
    int deleteUser(int id);
}

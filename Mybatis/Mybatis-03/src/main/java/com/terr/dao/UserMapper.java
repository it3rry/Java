package com.terr.dao;

import com.terr.pojo.User;

import java.util.List;

//dao等价与mapper
public interface UserMapper {

    //根据ID查询
    User getUserById(int id);

}

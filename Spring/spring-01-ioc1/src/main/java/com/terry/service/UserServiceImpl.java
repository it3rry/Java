package com.terry.service;

import com.terry.dao.UserDao;
import com.terry.dao.UserDaoImpl;

public class UserServiceImpl implements UserService{

    private UserDao userDao = new UserDaoImpl();

    public void getUser() {
        userDao.getUser();
    }
}

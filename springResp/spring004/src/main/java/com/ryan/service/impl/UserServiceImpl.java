package com.ryan.service.impl;

import com.ryan.dao.UserDao;
import com.ryan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public int add(int uid, String uname) {
        System.out.println("inner UserServiceImpl.add() method");
        userDao.addUser(uid, uname);
        return 0;
    }
}

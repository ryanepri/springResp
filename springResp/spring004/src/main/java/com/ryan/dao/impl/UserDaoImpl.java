package com.ryan.dao.impl;

import com.ryan.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public int addUser(Integer userid, String username) {
        System.out.println("inner UserDaoImpl.addUser() method");
        //int i =1/0;
        return 1;
    }
}

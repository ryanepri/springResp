package com.ryan.dao.impl;

import com.ryan.dao.UserDao;
import org.springframework.stereotype.Repository;


@Repository("userDaoImplA")
public class UserDaoImplA implements UserDao {
    public void add() {
        System.out.println("inner UserDaoImplA.add()");
    }
}

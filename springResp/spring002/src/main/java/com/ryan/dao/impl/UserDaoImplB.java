package com.ryan.dao.impl;

import com.ryan.dao.UserDao;
import org.springframework.stereotype.Repository;


@Repository("userDaoImplB")
public class UserDaoImplB implements UserDao {
    public void add() {
        System.out.println("inner UserDaoImplB.add()");
    }
}

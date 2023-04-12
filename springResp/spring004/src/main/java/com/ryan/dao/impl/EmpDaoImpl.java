package com.ryan.dao.impl;

import com.ryan.dao.EmpDao;
import com.ryan.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class EmpDaoImpl implements EmpDao {

    @Override
    public int addEmp(Integer empno, String ename, String job) {
        System.out.println("inner EmpDaoImpl.addUser() method");
        //int i =1/0;
        return 1;
    }
}

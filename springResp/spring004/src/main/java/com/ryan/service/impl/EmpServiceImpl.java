package com.ryan.service.impl;

import com.ryan.dao.EmpDao;
import com.ryan.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpDao empDao;

    @Override
    public int add(int uid, String uname, String job) {
        System.out.println("inner EmpServiceImpl.add() method");
        empDao.addEmp(uid, uname, job);
        return 0;
    }
}

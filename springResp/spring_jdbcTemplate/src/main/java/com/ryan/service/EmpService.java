package com.ryan.service;

import com.ryan.pojo.Emp;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmpService {
    int findEmpCount();

    Emp findByEmpno(int empno);

    List<Emp> findByDeptno(int deptno);

    int addEmp(Emp emp);

    int updateEmp(Emp emp);

    int deleteEmp(int empno);
}

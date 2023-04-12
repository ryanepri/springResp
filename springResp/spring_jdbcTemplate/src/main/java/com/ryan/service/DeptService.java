package com.ryan.service;

import com.ryan.pojo.Dept;

import java.util.List;

public interface DeptService {
    int[] deptBatchAdd(List<Dept> depts);

    int[] deptBatchUpdate(List<Dept> depts);

    int[] deptBatchDelete(List<Integer> deptnos);
}

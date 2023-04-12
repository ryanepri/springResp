package com.ryan.dao.impl;

import com.ryan.dao.DeptDao;
import com.ryan.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;

@Repository
public class DeptDaoImpl implements DeptDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int[] deptBatchAdd(List<Dept> depts) {
        String sql = "insert into dept values(DEFAULT,?,?)";
        List<Object[]> args = new LinkedList<>();
        for (Dept dept : depts) {
            Object[] arg = {dept.getDname(), dept.getLoc()};
            args.add(arg);
        }
        return jdbcTemplate.batchUpdate(sql, args);
    }

    @Override
    public int[] deptBatchUpdate(List<Dept> depts) {

        String sql = "update dept set dname =? ,loc =? where deptno=?";
        List<Object[]> args = new LinkedList<>();
        for (Dept dept : depts) {
            Object[] arg = {dept.getDname(), dept.getLoc(), dept.getDeptno()};
            args.add(arg);
        }
        return jdbcTemplate.batchUpdate(sql, args);
    }

    @Override
    public int[] deptBatchDelete(List<Integer> deptnos) {
        String sql = "delete from dept where deptno =?";
        List<Object[]> args = new LinkedList<>();
        for (Integer deptno : deptnos) {
            Object[] arg = {deptno};
            args.add(arg);
        }
        return jdbcTemplate.batchUpdate(sql, args);
    }
}

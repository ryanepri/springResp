package com.ryan;

import com.ryan.pojo.Dept;
import com.ryan.service.DeptService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeptTest {
    public ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    public DeptService deptService = context.getBean(DeptService.class);

    @Test
    public void myMethod1() {
        List<Dept> depts = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            depts.add(new Dept(null, "name" + i, "loc" + i));
        }

        int[] ints = deptService.deptBatchAdd(depts);
        System.out.println(Arrays.toString(ints));
    }

    @Test
    public void myMethod2() {
        List<Dept> depts = new ArrayList<>();
        for (int i = 51; i <= 60; i++) {
            depts.add(new Dept(i, "newname", "newLoc"));
        }

        int[] ints = deptService.deptBatchUpdate(depts);
        System.out.println(Arrays.toString(ints));
    }

    @Test
    public void myMethod3() {
        DeptService deptService = context.getBean(DeptService.class);
        List<Integer> deptnos = new ArrayList<>();
        for (int i = 48; i <= 57; i++) {
            deptnos.add(i);
        }
        int[] ints = deptService.deptBatchDelete(deptnos);
        System.out.println(Arrays.toString(ints));
    }


}

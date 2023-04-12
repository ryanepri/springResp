package com.ryan;

import com.ryan.pojo.Emp;
import com.ryan.service.EmpService;
import org.aspectj.apache.bcel.util.ClassPath;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

public class EmpTest {

    public ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    public EmpService bean = context.getBean(EmpService.class);


    /**
     * 查询员工个数
     */
    @Test
    public void myMethod1() {
        int empCount = bean.findEmpCount();
        System.out.println(empCount);
    }

    /**
     * 根据员工编号查询员工对象
     */
    @Test
    public void myMethod2() {
        Emp byEmpno = bean.findByEmpno(7369);
        System.out.println(byEmpno);
    }


    /**
     * 根据部门编号查询多个员工对象集合
     */
    @Test
    public void myMethod3() {
        List<Emp> emps = bean.findByDeptno(20);
        emps.forEach(System.out::println);
    }

    /**
     * 增加员工信息
     */
    @Test
    public void myMethod4() {
        int rows = bean.addEmp(new Emp(null, "TOM", "SALESMAN", 7521, new Date(), 2000.0, 100.0, 10));
        System.out.println(rows);
    }


    /**
     * 根据员工编号修改员工信息
     */
    @Test
    public void myMethod5() {
        int rows = bean.updateEmp(new Emp(7939, "JERRY", "MANAGER", 7839, new Date(), 3000.0, 0.0, 20));
        System.out.println(rows);
    }


    /**
     * 根据员工编号删除员工信息
     */
    @Test
    public void myMethod6() {
        int rows = bean.deleteEmp(1999);
        System.out.println(rows);
    }


}

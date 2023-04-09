package com.ryan;

import com.ryan.bean.Emp;
import com.ryan.dao.EmpDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpTest {
    @Test
    public void testBean() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring6.xml");
        Emp o1 = context.getBean("emp", Emp.class);
        System.out.println(o1);
    }
}

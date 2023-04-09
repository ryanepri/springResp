package com.ryan;

import com.ryan.dao.EmpDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpDaoTest {
    @Test
    public void testBean() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        EmpDao empDao = context.getBean("empDao", EmpDao.class);
        empDao.addEmp();
    }


}

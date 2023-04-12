package com.ryan;

import com.ryan.config.SpringConfig;
import com.ryan.dao.UserDao;
import com.ryan.dao.impl.UserDaoImpl;
import com.ryan.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.aspectj.SpringConfiguredConfiguration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    @Test
    public void myMethod() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        UserService user = context.getBean(UserService.class);
        int add = user.add(44, "mike");

    }

    @Test
    public void myMethod2() {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserDao user = context.getBean("userDaoImpl", UserDaoImpl.class);
        int add = user.addUser(44, "mike");

    }

    @Test
    public void myMethod3() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring3.xml");
        UserDao user = context.getBean("userDao", UserDaoImpl.class);
        int add = user.addUser(44, "mike");

    }
}

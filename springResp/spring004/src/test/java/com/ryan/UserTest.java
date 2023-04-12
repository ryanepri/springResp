package com.ryan;

import com.ryan.dao.UserDao;
import com.ryan.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    @Test
    public void myMethod() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        UserService user = context.getBean(UserService.class);
        int add = user.add(44, "mike");

    }
}

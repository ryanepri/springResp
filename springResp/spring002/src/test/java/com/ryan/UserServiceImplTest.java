package com.ryan;

import com.ryan.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceImplTest {
    @Test
    public void myMethod() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring2.xml");
        UserServiceImpl userServiceImpl = context.getBean("userServiceImpl", UserServiceImpl.class);
        userServiceImpl.add();
    }
}

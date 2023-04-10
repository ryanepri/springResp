package com.ryan;

import com.ryan.bean.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    @Test
    public void myMethod() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        User o1 = context.getBean("user", User.class);
        System.out.println(o1);
    }
}

package com.ryan;

import com.ryan.bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    @Test
    public void testBean() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        User user1 = context.getBean("userBean", User.class);
        User user2 = context.getBean("userBean", User.class);
        System.out.println("user1 == user2 :" + (user1 == user2));
    }


}

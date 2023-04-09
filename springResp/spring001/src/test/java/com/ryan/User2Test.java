package com.ryan;

import com.ryan.bean.User2;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class User2Test {
    /**
     *
     */
    @Test
    public void TestBean() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring5.xml");
        User2 o1 = context.getBean("user", User2.class);
        System.out.println("第四步:" + o1);
        context.close();
    }
}

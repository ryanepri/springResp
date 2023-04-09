package com.ryan;

import com.ryan.bean.Mouse;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookTest {
    @Test
    public void testBean() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring3.xml");
        Mouse o1 = context.getBean("mouseBean1", Mouse.class);
    }
}

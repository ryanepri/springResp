package com.ryan;

import com.ryan.bean.MyContext;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyContextTest {

    @Test
    public void myMethod() {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("myContext.xml");
        MyContext o1 = context.getBean("dataProper", MyContext.class);
        System.out.println(o1);
    }
}

package com.ryan;

import com.ryan.bean.Book;
import com.ryan.bean.BookFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookFactoryTest {
    /**
     * 注释报错
     * Bean named 'bookFactory' is expected to be of type 'com.ryan.bean.BookFactory'
     * but was actually of type 'com.ryan.bean.Book'
     */
    @Test
    public void TestBean() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring4.xml");
//        BookFactory o1 = context.getBean("bookFactory", BookFactory.class);
        Book o1 = context.getBean("bookFactory", Book.class);
        System.out.println(o1);
    }
}

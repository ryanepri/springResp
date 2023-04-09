package com.ryan;

import com.ryan.bean.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
    @Test
    public void testBean() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring3.xml");
        Student o1 = context.getBean("student1", Student.class);
        System.out.println("DI给对象属性赋值3-集合");
        System.out.println(o1.getBooks());
        System.out.println(o1.getBookSet());
        System.out.println(o1.getBookList());
        System.out.println(o1.getBookMap());
        System.out.println(o1.getBookList2());
    }
}

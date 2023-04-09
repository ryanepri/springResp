package com.ryan;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcAndDruidTest {
    @Test
    public void myMethod() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("JdbcAndDruid.xml");
        DruidDataSource o1 = context.getBean("jdbcBean", DruidDataSource.class);
        System.out.println(o1);
    }
}

package com.ryan;

import com.ryan.bean.Mouse;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MouseTest {
    /**
     * DI测试 *关于bean引用 注入设定好的数据类型/对象
     */
    @Test
    public void testBean() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring2.xml");
        Mouse o1 = context.getBean("mouseBean1", Mouse.class);
        Mouse o2 = context.getBean("mouseBean2", Mouse.class);
        System.out.println("DI测试 *关于bean引用 注入设定好的数据类型/对象");
        System.out.println(o1);
        System.out.println(o2);
    }
}

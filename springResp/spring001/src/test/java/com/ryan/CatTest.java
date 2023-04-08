package com.ryan;

import com.ryan.bean.Cat;
import com.ryan.bean.Mouse;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CatTest {
    /**
     * DI测试 *关于bean引用 注入设定好的数据类型/对象
     * 外部bean引用
     */
    @Test
    public void testBean() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring2.xml");
        Cat o1 = context.getBean("catBean1", Cat.class);
        System.out.println("DI测试 *关于bean引用 注入设定好的数据类型/对象-外部bean引用");
        System.out.println(o1);
    }

    /**
     * DI测试 *关于bean引用 注入设定好的数据类型/对象
     * 内部bean引用
     */
    @Test
    public void testBean1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring2.xml");
        Cat o1 = context.getBean("catBean2", Cat.class);
        Cat o2 = context.getBean("catBean3", Cat.class);
        System.out.println("DI测试 *关于bean引用 注入设定好的数据类型/对象-内部bean引用");
        System.out.println(o1);
        System.out.println(o2);
    }
}

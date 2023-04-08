package com.ryan;

import com.ryan.bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    /**
     * 测试bean标签属性 开启单例模式
     */
    @Test
    public void testBean() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        User user1 = context.getBean("userBean1", User.class);
        User user2 = context.getBean("userBean1", User.class);
        System.out.println("user1 == user2 :" + (user1 == user2));
    }


    /**
     * 测试DI
     * 通过构造方法来注入value
     */
    @Test
    public void testBean2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        User userBean2 = context.getBean("userBean2", User.class);
        User userBean3 = context.getBean("userBean3", User.class);
        System.out.println("测试DI\n" +
                "     * 通过构造方法来注入value");
        System.out.println(userBean2);
        System.out.println(userBean3);
    }

    /**
     * 测试DI简化版本
     * p、sc名称空间
     * 通过构造方法来注入value
     */
    @Test
    public void testBean3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        User userBean4 = context.getBean("userBean4", User.class);
        User userBean5 = context.getBean("userBean5", User.class);
        System.out.println("  * 测试DI简化版本\n" +
                "     * p、sc名称空间\n" +
                "     * 通过构造方法来注入value");
        System.out.println(userBean4);
        System.out.println(userBean5);
    }

    /**
     * DI测试 *注入空值和特殊符号
     */
    @Test
    public void testBean4() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        User user = context.getBean("user1", User.class);
        System.out.println("DI测试 *注入空值和特殊符号");
        System.out.println(user);
    }
}

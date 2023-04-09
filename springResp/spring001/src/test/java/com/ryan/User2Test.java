package com.ryan;

import com.ryan.bean.User2;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class User2Test {
    /**
     * bean生命周期测试类。
     * 1 通过构造器创建bean实例           执行构造器
     * 2 为bean属性赋值                         执行set方法
     * （后置生命周期）
     * 3 初始化bean                                调用bean的初始化方法,需要配置指定调用的方法
     * （后置生命周期）
     * 4 bean的获取                                容器对象 getBean方法
     * 5 容器关闭销毁bean                      调用销毁方法,需要配置指定调用的方法
     */
    @Test
    public void TestBean() {
        //要使用close方法，数据类型要为ClassPathXmlApplicationContext
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring5.xml");
        User2 o1 = context.getBean("user", User2.class);
        System.out.println("第四步:" + o1);
        context.close();
    }
}

package com.ryan.testCglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * cglib动态代理模式
 * 注释版
 */
public class testCglib000 {
    public static void main(String[] args) {
        Person p1 = new Person();
        // 获取一个Person的代理对象
        // 1 获得一个Enhancer对象
        Enhancer enhancer = new Enhancer();
        // 2 设置父类字节码
        enhancer.setSuperclass(p1.getClass());
        // 3 获取MethodIntercepter对象 用于定义增强规则
        MethodInterceptor methodInterceptor = new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                /**
                 *          Object o,  生成之后的代理对象 personProxy
                 *          Method method,  父类中原本要执行的方法  Person>>> eat()
                 *          Object[] objects, 方法在调用时传入的实参数组
                 *          MethodProxy methodProxy  子类中重写父类的方法 personProxy >>> eat()
                 */
                Object res = null;
                if (method.getName().equals("eat")) {
                    // 如果是eat方法 则增强并运行
                    System.out.println("饭前洗手");
                    res = methodProxy.invokeSuper(o, objects);
                    System.out.println("饭后刷碗");
                } else {
                    // 如果是其他方法 不增强运行
                    res = methodProxy.invokeSuper(o, objects); // 子类对象方法在执行,默认会调用父类对应被重写的方法
                }
                return res;
            }
        };


        // 4 设置methodInterceptor
        enhancer.setCallback(methodInterceptor);
        // 5 获得代理对象
        Person personProxy = (Person) enhancer.create();
        // 6 使用代理对象完成功能
        personProxy.eat("包子");
    }
}


class Person {

    public Person() {
    }


    public void eat(String foodName) {
        System.out.println("张三正在吃" + foodName);
    }


}
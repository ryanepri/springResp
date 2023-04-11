package com.ryan.testProxy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//请注意导包导java.lang.reflect
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;


/**
 * JDK动态代理、面向接口
 * 详细注释版
 */
public class TestProxy001 {
    public static void main(String[] args) {
//        Dinner p1 = new Person("ryan");
//        p1.eat("cola");

        //Person被替换了
        final Dinner dinner = new Student("ryan");
//        dinner.eat("包子");

        //动态代理参数准备
        //被代理的对象的类加载器
        ClassLoader loader = dinner.getClass().getClassLoader();
        //被代理的对象所实现的所有接口
        Class<?>[] interfaces = dinner.getClass().getInterfaces();
        //InvocationHandler h执行处理器对象（专门用于定义增强规则
        InvocationHandler h = new InvocationHandler() {
            //invoke方法 当我们让代理对象调用任何方法时,都会触发invoke方法的执行
            @Override
            public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
//              Object o,代理对象
//              Method method,被代理的对象
//              Object[] objects,被代理方法运行时的实参

                System.out.println("inner invoke(x,x,x) Method");

                System.out.println("method.getName():" + method.getName());
                System.out.println("Arrays.toString(objects):" + Arrays.toString(objects));


                Object res = null;

                if (method.getName().equals("eat")) {
                    // 让原有的eat的方法去运行前添加点其其他逻辑
                    System.out.println("饭前洗手");
                    res = method.invoke(dinner, objects);
                    System.out.println("饭后洗碗");
                } else {
                    //// 如果是其他方法,那么正常执行就可以了
                    res = method.invoke(dinner, objects);
                }


                return res;
            }
        };

        /**
         * 通过Porxy动态代理获得一个代理对象,在代理对象中,对某个方法进行增强
         * 就是不修改类名但还能用这个方法
         *
         * lassLoader loader        被代理的对象的类加载器
         * Class[] interfaces       被代理的对象所实现的所有接口
         * InvocationHandler h      执行处理器对象（专门用于定义增强规则
         */
        Dinner dinnerProxy = (Dinner) Proxy.newProxyInstance(loader, interfaces, h);
        dinnerProxy.eat("包子");
        dinnerProxy.drink("可乐");
    }

}


/**
 * 中介
 * 食堂
 * 代理对象
 */
interface Dinner {
    void eat(String foodName);

    void drink(String drinkName);
}


/**
 * 被代理的对象1
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
class Person implements Dinner {

    private String name;

    @Override
    public void eat(String foodName) {
        System.out.println(this.name + "正在吃" + foodName);
    }

    @Override
    public void drink(String drinkName) {
        System.out.println(this.name + "正在喝" + drinkName);
    }
}

/**
 * 被代理的对象2
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
class Student implements Dinner {

    private String name;

    @Override
    public void eat(String foodName) {
        System.out.println(this.name + "正在吃" + foodName);
    }

    @Override
    public void drink(String drinkName) {
        System.out.println(this.name + "正在吃" + drinkName);
    }
}

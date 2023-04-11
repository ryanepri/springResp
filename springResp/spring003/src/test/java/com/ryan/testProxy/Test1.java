import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;


/**
 * JDK动态代理、面向接口
 * 无注释版
 */
public class Test1 {
    public static void main(String[] args) {

        final Dinner dinner = new Person("张三");
//        3
        ClassLoader classLoader = dinner.getClass().getClassLoader();
        Class[] interaces = dinner.getClass().getInterfaces();
        InvocationHandler handler = new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("inner invoke(x,x,x) method");
                Object res = null;
                if (method.getName().equals("eat")) {
                    System.out.println("饭前洗手");
                    // 让原有的eat的方法去运行
                    res = method.invoke(dinner, args);
                    System.out.println("饭后刷碗");
                } else {
                    // 如果是其他方法,那么正常执行就可以了
                    res = method.invoke(dinner, args);
                }
                return res;

            }
        };
//
        Dinner dinnerProxy = (Dinner) Proxy.newProxyInstance(classLoader, interaces, handler);
        dinnerProxy.eat("包子");
        dinnerProxy.drink();
    }
}


interface Dinner {
    void eat(String foodName);

    void drink();
}


class Person implements Dinner {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void eat(String foodName) {
        System.out.println(name + "正在吃" + foodName);
    }

    @Override
    public void drink() {
        System.out.println(name + "正在喝茶");
    }
}

class Student implements Dinner {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void eat(String foodName) {
        System.out.println(name + "正在食堂吃" + foodName);
    }

    @Override
    public void drink() {
        System.out.println(name + "正在喝可乐");
    }
}
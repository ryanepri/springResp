package com.ryan;

/**
 * 静态代理 demo
 */
public class Test {
    public static void main(String[] args) {
        Person person = new Person("张三");
        Court court = new Lawyer(person);
        court.doCourt();
    }

}

/**
 * 接口
 */
interface Court {
    void doCourt();
}


/**
 * 代理类
 */
class Lawyer implements Court {
    private Person person;

    public Lawyer(Person person) {
        this.person = person;
    }

    @Override
    public void doCourt() {
        System.out.println("律师取证:视频证明张三当时正在旅游,不在案发现场");
        System.out.println("律师总结:张三不可能去杀人");
        person.doCourt();

    }
}

/**
 * 被代理的类
 */
class Person implements Court {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void doCourt() {
        System.out.println(name + "说:我没有杀人");
    }

}

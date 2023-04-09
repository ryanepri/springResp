package com.ryan.bean;

/**
 * 测试bean生命周期
 */

public class User2 {
    private Integer uid;
    private String uname;
    private String pwd;

    /**
     * 第一步:User构造
     */
    public User2() {
        System.out.println("第一步:User构造");
    }


    /**
     * 第二步:User属性赋值
     */
    public void setUid(Integer uid) {
        System.out.println("第二步:User.uid属性赋值");
        this.uid = uid;
    }

    public void setUname(String uname) {
        System.out.println("第二步:User.uname属性赋值");
        this.uname = uname;
    }

    public void setPwd(String pwd) {
        System.out.println("第二步:User.pwd属性赋值");
        this.pwd = pwd;
    }

    public User2(Integer uid, String uname, String pwd) {
        this.uid = uid;
        this.uname = uname;
        this.pwd = pwd;
    }

    /**
     * 第三步:User初始化
     */
    public void initUser2() {
        System.out.println("第三步:User初始化");
    }

    /**
     * 第四步:bean的获取 容器对象 getBean方法(不在这里。在test类里。)
     */

    /**
     * 第五步:User销毁
     */
    public void destoryUser2() {
        System.out.println("第五步:User销毁");
    }


    public Integer getUid() {
        return uid;
    }


    public String getUname() {
        return uname;
    }


    public String getPwd() {
        return pwd;
    }

    @Override
    public String toString() {
        return "User2{" + "uid=" + uid + ", uname='" + uname + '\'' + ", pwd='" + pwd + '\'' + '}';
    }
}

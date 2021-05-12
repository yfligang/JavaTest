package com.liepin.rim.org.day01.test09;

public class Son extends Father {

    //子类静态代码块
    static {
        System.out.println("子类静态代码块");
    }

    //子类构造代码块
    {
        System.out.println("子类构造代码块");
    }

    //子类构造方法
    public Son(){
        System.out.println("子类构造方法");
    }

}

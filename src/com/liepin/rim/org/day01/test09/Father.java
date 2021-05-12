package com.liepin.rim.org.day01.test09;
//父类包含静态代码块、构造代码块和构造方法
public class Father {

    //静态代码块
    static {
        System.out.println("父类静态代码块");
    }

    //构造代码块
    {
        System.out.println("父类构造代码块");
    }

    //构造方法
    public Father(){
        System.out.println("无参父类构造方法");
    }

    public static void main(String[] args){
        new Son();
    }

    /*
    父类有静态代码块、构造代码块和构造方法，运行顺序是 静态代码块 > 构造代码块 > 构造方法
    子类有静态代码块、构造代码块和构造方法，运行顺序是 静态代码块 > 构造代码块 > 构造方法

    如果既有父类又有子类，运行顺序为:
    父类静态代码块、子类静态代码块(类加载时就执行)
    父类构造代码块、父类构造方法
    子类构造代码块、子类构造方法
     */



}

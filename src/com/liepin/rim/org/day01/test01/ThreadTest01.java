package com.liepin.rim.org.day01.test01;

public class ThreadTest01 extends Thread {

    private String name;
    private int age;

    //无参构造函数
    public ThreadTest01(){
        System.out.println("无参构造函数ThreadTest01");
    }

    //有参构造函数
    public ThreadTest01(String name,int age){
        System.out.println(name + " " + age);
    }

    @Override
    public void run() {
        super.run();
    }
}

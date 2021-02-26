package com.liepin.rim.org.day01.test02;

public class Demo02 {

    public static void main(String[] args){
        Demo01 demo01 = new Demo01();
        //demo01.run();
        demo01.run(100);
        System.out.println("----------------------------------");
        demo01.run();
        System.out.println("==================================");
        demo01.start();
    }
}

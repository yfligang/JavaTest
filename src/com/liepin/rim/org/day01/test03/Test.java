package com.liepin.rim.org.day01.test03;

import java.util.Map;

public class Test {
    public static void main(String[] args){
        Fu fu = new Zi();
        //调用父类和子类都有的method方法(成员方法)，根据多态打印子类的方法(优先子类对象的方法)
        fu.method();
        //调用成员变量，父类和子类都有，显示父类的
        System.out.println("年龄为 " + fu.age); //成员变量显示的是父类的
        //如果想调用子类中的成员变量
        fu.setName("Hello");
        System.out.println(fu.getName()); //调用子类的名称

        System.out.println("============================================");

        FuInterImpl fuInter = new FuInterImpl();
        fuInter.method();
        fuInter.method(100);

    }
}

package com.liepin.rim.org.day01.test14;

public abstract class School {
    //抽象类中包含抽象方法
    public abstract void method(); //无返回值抽象方法

    //public abstract cool();

    public School(){
        System.out.println("抽象类中的构造方法");
    }

    //创建抽象类中有返回值的抽象方法
    //public School();

}

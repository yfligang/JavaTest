package com.liepin.rim.org.day01.test13;

import java.awt.*;

public class TestDemo {
    static final int m = 100;
    static final String n = "name";

    void draw(){
        System.out.println(1);
    }

    public static void main(String[] args){
        Teacher teacher = new Teacher();
        Student student = new Student();
        School school = new School();
//        TestDemo td = new TestDemo();
//        td.draw();
        method(teacher);
        method(student);
        method(school);
    }

    public static void method(Object object){
        System.out.println(object); //打印传入参数的地址
    }
}

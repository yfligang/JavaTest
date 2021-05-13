package com.liepin.rim.org.day01.test10;

import java.util.concurrent.ConcurrentHashMap;

public class Student extends Teacher{
    public int num = 100;

    static {
        System.out.println("子类的静态代码块");
    }

    public Student(){
        //this();
        //super();
        System.out.println("子类构造方法");
        //this.method();
    }

    Student(int age){
        this(); //调用的本类的无参构造函数
        System.out.println("Student(age)" + age);
        System.out.println("=====================");
    }

    Student(String name,int age){
        this(age);
        System.out.println("name " + name + "age " + age);
    }

    public void method(){
        System.out.println(3);
    }

    public static void main(String[] args){
        Student st = new Student();
        Student st1 = new Student(10);
        Student st2 = new Student("LG",100);

        ConcurrentHashMap ch = new ConcurrentHashMap();
        ch.put("1",2);
        ch.put(2,1);

        for (Object obj:ch.values()
             ) {
            System.out.println(obj);
        }

    }
}

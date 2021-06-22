package com.liepin.rim.org.day01.test13;

public class Teacher {
    //{}运行在static后面
    {
        System.out.println("first");
    }
    static {
        System.out.println("Teacher's static");
    }

    public Teacher(){
        System.out.println("Teacher");
    }
}

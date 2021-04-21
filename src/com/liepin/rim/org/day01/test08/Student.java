package com.liepin.rim.org.day01.test08;

public class Student {

    public Student(){
        System.out.println("无参构造函数");
    }

    private String name;

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchFieldException {
        Student student = new Student();
        String str = student.name;
        System.out.println(str);
    }
}

package com.liepin.rim.org.day02;

/*
深入学习Java的继承
 */
public class Learn1014 {

    //构造方法
    public Learn1014(){
        System.out.println("这是父类无参构造方法");
    }

    public void fatherMethod(int num){
        int sum = num + 1;
        System.out.println(sum);
    }

    public String fatherReturn(String str){
        String father = str + 100;
        System.out.println(father);
        return str;
    }
}

package com.liepin.rim.org.day08;

public class Sokution01 {

    public static void method01(int num){
        int m = num;
        System.out.println(m + 1);
    }

    public static void method02(String str){
//        String name = "Hello,world!";
        String[] ss = str.split(",");
        for (String str01:ss){
            
        }
        System.out.println(str.contains("Hello") + " " + str);

        Object obj = new Object();
    }

    public static void main(String[] args){
        method01(100);  //101
        method02("Hello,world!");
    }
}

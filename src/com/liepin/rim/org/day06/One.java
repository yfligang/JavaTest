package com.liepin.rim.org.day06;

public class One {
    /*
    定义一个方法，用来判断两个数字是否相同
     */

    public static void firstMethod(int m,int n){
        if (m == n){
            System.out.println("两个数字一样大");
        }else {
            System.out.println("两个数字不一样大");
        }
    }

    public static void main(String[] args){
        firstMethod(1,2);
    }
}

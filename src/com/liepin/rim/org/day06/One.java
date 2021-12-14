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

    public static boolean isSame(int m,int n){
        boolean isSame;
        if (m == n){
            System.out.println("数字一样大");
            isSame = true;
        }else {
            isSame = false;
            System.out.println("数字不一样大");
        }

        return isSame;
    }

    public static void main(String[] args){
        firstMethod(1,2);
        isSame(1,1);
        secondMethod(isSame(9,10));
    }

    public static void secondMethod(boolean isSame){
        if (isSame){
            System.out.println("我是第一名");
        }else {
            System.out.println("痛苦还是一样");
        }
    }
}

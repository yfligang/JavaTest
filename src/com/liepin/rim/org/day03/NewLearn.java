package com.liepin.rim.org.day03;

import java.util.ArrayList;
import java.util.List;

public class NewLearn {
    public  static void mind(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        for (Integer num:list
             ) {
            System.out.println(num);
        }

        list.get(0);
    }

    //定义一个方法,包含两个参数num1和num2,返回这两个参数的最大值
    public static int max(int num1,int num2){
        int result;
        if (num1 > num2){
            result = num1;
        }
        else {
            result = num2;
        }
        System.out.println(result);
        return result;
    }

    public static double min(double num1,int num2){
        double result;
        result = num1 + num2;
        System.out.println(result);
        return result;
    }

    public static String strMethod(int num1,int num2){
        String str = num1 + num2 + " 1";
        System.out.println(str);
        return str;
    }

    public static void main(String[] args){
        //max(1,2);
        //min(100,20);
        //strMethod(100,2000);
        mind();
    }
}

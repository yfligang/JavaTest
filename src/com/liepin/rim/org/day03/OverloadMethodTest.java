package com.liepin.rim.org.day03;

import java.util.ArrayList;
import java.util.List;

public class OverloadMethodTest {
    //方法的重载
    //方法名称为sum, 两个参数，参数类型分别为int
    public static int sum(int a,int b){
        return a + b;
    }
    //方法名称为sum,三个参数，参数类型分别为int (参数个数不同)
    public static int sum(int a,int b,int c){
        return a + b + c;
    }

    //参数类型不同
    public static int sum(double a,int b){
        return (int)(a + b);
    }


    public static void sunshine(){
        //在原数组基础上反转数组,使用新数组
        int[] array = new int[]{10,20,15,32,10};

        int[] arrayB = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayB[i] = array[array.length-1-i];

        }
        System.out.println("新的数组内容为: ");
        for (int i = 0; i < arrayB.length; i++) {
            if (i == arrayB.length -1){
                System.out.print(arrayB[i]);
            }else {
                System.out.print(arrayB[i] + ",");
            }
        }

    }

    public static void main(String[] args){
        sunshine();
        System.out.println("\n" + "-------------------------------");
        one();
    }


    public static void one(){
        int[] array = new int[]{1,2,3,4,1,2,3,4,1};
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        for (int num:list
             ) {
            System.out.print(num + ",");
        }
    }
}

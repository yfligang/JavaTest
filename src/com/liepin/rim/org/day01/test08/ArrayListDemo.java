package com.liepin.rim.org.day01.test08;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args){
        //创建一个可变数组
        int num = 0;
        int[] array = new int[num];
        //System.out.println(array);
        for (int num1:array
             ) {
            //System.out.println(num1);
        }

        ArrayListDemo ald = new ArrayListDemo();
        ald.method(10);
        ald.function(10);

    }

    public void method(int num){
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = i;
        }

        for (int num1:array
             ) {
            System.out.println(num1);
        }

        System.out.println("============================");
    }


    public int function(int num){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < num ; i++) {
            list.add(i);
            System.out.println("list的长度为: " + list.size());
        }
        for (int num01:list
             ) {
            System.out.println(num01);
        }

        return num;
    }
}

package com.liepin.rim.org.day01.test01;

import java.util.ArrayList;

public class ThreadTest02 {
    //合并两个有序数组
    public static void main(String[] args){
        int[] array1 = {1,2,3,4};
        int[] array2 = {3,4,5,6};

        ArrayList<Integer> list = new ArrayList<>();
        for (int num:array1
             ) {
            list.add(num);
        }
        System.out.println(list);

        for (int num:array2
             ) {
            list.add(num);
        }
        System.out.println(list);
    }
}

package com.liepin.rim.org.reverse;

import java.util.ArrayList;

public class TestDemo {
    public static void main(String[] args){
        testNum();
    }
    /*
    给你一个整型数组 nums ，在数组中找出由三个数组成的最大乘积，并输出这个乘积。
     */

    //解题思路: 找到数组中正数的前三个最大的数，然后乘积

    public static void testNum(){
        //先定义一个数组
        int[] array = new int[]{10,-10,5,1,2};
        int max = array[0];
        int temp;
        for (int i = 0; i < array.length; i++) {
            if (array[i +1] > max){
                temp = max;
                array[i] = array[i +1];
                array[i + 1] = temp;
            }
        }
        System.out.println(array);

        //讲数组放到一个集合中
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            arrayList.add(array[i]);
        }
        //找集合中前三个最值 从大到小排列下

    }
}

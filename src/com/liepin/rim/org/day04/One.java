package com.liepin.rim.org.day04;

public class One {
    /*
    给你一个整型数组 nums ，在数组中找出由三个数 组成的最大乘积，并输出这个乘积。
     */

    public static void method(){
        //创建一个数组
        int[] array = new int[6];
        array[0] = 1;
        array[1] = 55;
        array[2] = -18;
        array[3] = 77;
        array[4] = 102;
        array[5] = -15;

        for (int num:array
             ) {
            System.out.println(num);
        }

        System.out.println("===========我是分割线============");

        //从数组中找到前三个最大的
        int temp;
        for (int i = 0; i < array.length - 1 ; i++) {
            for (int j = i + 1; j < array.length ; j++) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int num:array
        ) {
            System.out.println(num);
        }
    }

    public static void main(String[] args){
        method();
    }

}

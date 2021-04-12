package com.liepin.rim.org.day01.test01;

import java.util.ArrayList;

public class Test01 {
    //合并两个有序数组 {1,2,3,4} {1,2,7,8} 合并后为 {1,1,2,2,3,4,7,8} 按照顺序从小到大

    public static void main(String[] args){

        int[] array1 = {1,2,3,4};
        int[] array2 = {1,2,7,8};

        //先将两个有序数组合并，然后再排序
        ArrayList<Integer> list = new ArrayList<>();
        for (int num:array1
             ) {
            list.add(num);
        }

        for (int num:array2
             ) {
            list.add(num);
        }

        System.out.println(list);


    }
}

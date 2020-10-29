package com.guazi.study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NumTestDemo {

    public static void main(String[] args){

        int[] num1 = {1,2,3,4,5,0,0,0};
        int[] num2 = {2,3,5,8,1};

        //将两个数组合并并进行排序

        ArrayList<Integer> list1 = new ArrayList();
        for (int i = 0; i < num1.length; i++) {
            list1.add(num1[i]);
        }

        for (int i = 0; i < num2.length; i++) {
            list1.add(num2[i]);
        }

        //对ArrayList进行排序
        Collections.sort(list1);

        for (Integer num:list1
        ) {
            System.out.print(num + ",");
        }


    }
}

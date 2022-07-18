package com.liepin.rim.org.day10.test01;

import java.util.ArrayList;
import java.util.List;

public class Test0003 {
    //打印1-100之间所有是9的倍数的整数，统计个数及总和
    public static void main(String[] args){
        //9的倍数的整数，则num/9 == 0 可以整除9
        int num = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 100;i++){
            if (i % 9 == 0){
                //System.out.println("1~100中是9倍数的整数为: " + i);
                num = num + i;
                list.add(i);
            }
        }
        System.out.println("1~100中是9倍数的整数为: ");
        for (Integer num01:list
             ) {
            System.out.print(num01 + " ");
        }
        System.out.println();
        System.out.println("1~100中是9倍数的整数的和为: " + num);
    }
}

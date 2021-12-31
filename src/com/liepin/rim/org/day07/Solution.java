package com.liepin.rim.org.day07;

import java.util.HashMap;

public class Solution {
    /*
    给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。

你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。

你可以按任意顺序返回答案。
     */

    public static void method(int[] array, int num){
        if (array.length <= 0){
            return;
        }

        int target = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                target = array[i] + array[j];
                if (target == num){
//                    HashMap hashMap = new HashMap();
//                    hashMap.put(i,j);
//                    System.out.println();
                    System.out.println("两个数字为: " + i + "和" + j);
                }

            }
        }
    }

    public static void main(String[] args){
        //method(new int[]{1,2,3,4,5},3);
        //method(new int[]{10, 10, 20, 0, 11, 9,8,12},20);
        Solution solution = new Solution();
        solution.strMethod("H");
    }

    public String strMethod(String str){
        String string = "输入字符不能为空";
        if (str.length() <= 1){
            System.out.println(string);
            return string;
        }else {
            return str;
        }
    }


}





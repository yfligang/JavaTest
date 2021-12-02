package com.liepin.rim.org.reverse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class One {
    //随机生成100个数，从找到重复次数最多的数和对应的次数
    /*
    1.随机生车100个数 创建一个方法
    2.从这100个数中找到重复次数最多的数
    3.找到出现最多数的次数
     */

    public static ArrayList<Integer> arrayList(int num){
        if (num == 0){
            System.out.println("数组长度不能为0.请重新输入");
            return null;
        }
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int num1 = random.nextInt(num);
            arrayList.add(num1);
        }
        //打印出ArrayList中随机数的值
        for (int num2:arrayList
             ) {
            System.out.print(num2 + " ");
        }

        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.size() == 0){
                System.out.println("数组长度不能为0.请重新输入");
                return null;
            }
            if (hashMap.containsKey(arrayList.get(i)) == false){
                hashMap.put(arrayList.get(i),1);
            }else {
                hashMap.put(arrayList.get(i),hashMap.get(arrayList.get(i)) + 1);
            }
        }
        System.out.println("=======================");

        System.out.print(hashMap + ";");

        System.out.println("=======================");
        for (int num01:hashMap.values()
             ) {
            System.out.print(num01 + " ");
        }
        System.out.println("=======================");
        for (int num02:hashMap.keySet()
             ) {
            System.out.print(num02 + " ");
        }

        return arrayList;
    }


}

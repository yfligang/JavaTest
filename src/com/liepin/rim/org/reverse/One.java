package com.liepin.rim.org.reverse;

import java.util.ArrayList;
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
            return null;
        }
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            int num1 = random.nextInt(num);
            arrayList.add(num1);
        }
        //打印出ArrayList中随机数的值
        for (int num2:arrayList
             ) {
            System.out.println(num2);
        }

        return arrayList;
    }


}

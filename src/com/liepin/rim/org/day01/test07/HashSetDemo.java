package com.liepin.rim.org.day01.test07;

import java.util.HashSet;

public class HashSetDemo {

    public void method(int num){
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < num; i++) {
            hs.add(i);
        }

        hs.add(11);
        //hs.clear();
        boolean bl = hs.contains(5);
        System.out.println(bl);

        //先判断值是否在集合中，如果存在，则删除并返回true; 如果不存在，则不删除并返回false
        boolean bl1 = hs.remove(3);

        for (int num1:hs
             ) {
            System.out.print(num1 + " ");
        }

        System.out.println("\n" + "集合size数为: " + hs.size());
    }

    public static void main(String[] args){
        HashSetDemo hsd = new HashSetDemo();
        hsd.method(10);
    }
}

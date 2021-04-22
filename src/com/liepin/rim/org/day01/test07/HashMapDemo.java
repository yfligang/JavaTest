package com.liepin.rim.org.day01.test07;

import java.util.HashMap;

public class HashMapDemo {

    public void method(int num){
        HashMap<Integer,String> map = new HashMap<>();
        for (int i = 0; i < num; i++) {
            map.put(i,"DanDan"+i);
        }

        boolean bl1 = map.containsKey("5");
        boolean bl2 = map.containsValue("DanDan8");
        System.out.println(bl1);
        System.out.println(bl2);

        String str02 = map.remove(0);
        System.out.println("删除掉的字符串为: " +  str02);
        map.remove(1,"hello");
        boolean bl3 = map.remove(1,"hello");
        System.out.println(bl3);

        for (Object obj:map.entrySet()
             ) {
            System.out.println(obj);
        }
        System.out.println("=================================");
        System.out.println(map);

        //key
        for (int num1:map.keySet()
             ) {
            System.out.println("map的key为: " + num1);
        }
        //value
        for (String str1:map.values()
             ) {
            System.out.println("map的值为: " + str1);
        }
        //map长度
        System.out.println("map的长度为: " + map.size());
    }

    public static void main(String[] args){
        HashMapDemo hmd = new HashMapDemo();
        hmd.method(10);
    }
}

package com.liepin.rim.org.day01;

import java.util.ArrayList;
import java.util.List;

public class Demo05 {
    //验证ArrayList的移除功能
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(10);
        list.add(12);
        list.add(5);
        //list.add("Hello");
        System.out.println("集合未删除前为  " + list);
        System.out.println("===========================");

        //删除集合中的元素
        List<String> list1 = new ArrayList<>();
        list1.add("hello");
        list1.add("world");
        list1.add("1");
        list1.add("2");
        list1.add("1");

        list1.remove("1");
        System.out.println(list1.get(3));
        //删除元素针对于String字符串，如果集合中有重复的，只删除第一个，后面的不变
    }
}

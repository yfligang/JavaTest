package com.liepin.rim.org.day01.test07;

import java.util.ArrayList;
//ArrayList集合的使用 线程不安全，一般用于单线程

public class Demo001 {
    //数组中插入数据
    public void method(int size,int m){
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add("Hello" + i);
        }
        //插入一项
        list.add(4,"world!");
        list.remove(m);
        //list.clear();//清空arraylist集合
        int size01 = list.size(); //i+1
        boolean bl = list.contains("world!");
        System.out.println(bl);


        //删除一项

        for (String str:list
             ) {
            System.out.print(str + " ");
        }

        System.out.println("\n" + "List长度" + size01);


    }

    public static void main(String[] args){
        Demo001 d = new Demo001();
        d.method(10,2);
    }
}

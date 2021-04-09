package com.liepin.rim.org.day01.test01;

import java.util.ArrayList;

//两个线程
public class Demo001 {

    private String name;

    public static void main(String[] args){
        ThreadTest01 t1 = new ThreadTest01("李刚",20);
        Demo001 demo = new Demo001();
        String name = "abcabccc";
        demo.function(name);
    }

    public void function(String s){
        char[] array = s.toCharArray();
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            list.add(array[i]);
        }
        System.out.println(list);
    }

}

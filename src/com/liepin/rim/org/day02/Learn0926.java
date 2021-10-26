package com.liepin.rim.org.day02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Learn0926 {
    static String str1 = "Hello";
    static String str2 = "World";
    static int num1 = 0;
    static int num2 = 1;

    public List method(){
        List list1 = new ArrayList();
        list1.add(str1);
        list1.add(str2);
        list1.add(num1);
        list1.add(num2);
        return list1;
    }

    public static void main(String[] args){
        Learn0926 ddzt = new Learn0926();
        ddzt.method();

    }
}

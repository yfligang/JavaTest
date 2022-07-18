package com.liepin.rim.org.day08;

import java.lang.reflect.Parameter;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.function.DoubleToIntFunction;

public class StringDemo implements InterfaceTag {
    //静态代码块
    static{
        int m = 1;
        String str1 = "Hello";
        int[] num1 = {1,2,3,4};
        char a = 'A';
        double b = 1011;
        float c = 1.001f;
        System.out.println("静态代码块" + m + str1 + num1 + a + b + c);
    }

    //无参构造方法
    public StringDemo(){
        System.out.println("无参构造方法");
    }

    public StringDemo(String str){
        System.out.println("有参构造方法" + str);
    }

    public String stringMethod(String str){
        System.out.println("方法stringMethod" + str);
        return str;
    }







    public static void main(String[] args){
        //
        StringDemo stringDemo = new StringDemo();
        stringDemo.stringMethod("123");
        //StringDemo stringDemo1 = new StringDemo("Hello");

        InterfaceTag interfaceTag = str -> {
            System.out.println(str);
            return true;
        };

        interfaceTag.filter("aa");
        hancle(interfaceTag);

    }

    public static void hancle(InterfaceTag interfaceTag){
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");

    }

    @Override
    public boolean filter(String str) {
        System.out.println("打印接口中的方法" + " " + str);
        return false;
    }

    @Override
    public String getInfo() {
        System.out.println("一片冰心在玉壶");
        return null;
    }
}

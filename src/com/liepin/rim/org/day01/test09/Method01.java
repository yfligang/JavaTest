package com.liepin.rim.org.day01.test09;

public class Method01 {

    public static void main(String[] args){
        Integer var1 = new Integer(1);
        System.out.println(var1); //1

        Integer var2 = var1;
        System.out.println(var2);
        System.out.println(var2.intValue());
        System.out.println(var1 == var2);

        doSomething(var2);
    }

    public static void doSomething(Integer integer){
        integer = new Integer(2);
        System.out.println(integer);  //2
    }



}

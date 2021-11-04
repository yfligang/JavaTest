package com.liepin.rim.org.day03;

public class Method01 {

    public static int cool(int a,int b){
        if (a > b) {
            System.out.println(a);
            return a;
        }else {
            System.out.println(b);
            return b;
        }
    }

    public static void main(String[] ages){
        cool(2,8);
    }
}

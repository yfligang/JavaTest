package com.liepin.rim.org.day05;

public class Second {
    //将方法中的内容写的复杂一些，然后返回值非常简单
    public static String firstMethod(int num){
        switch (num){
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            default:
                System.out.println("结束了，没有合适的");
                break;
        }
        return "Hello,World";
    }

    public static void secondMethod(String string){
        System.out.println(string);
    }

    public static void main(String[] args){
        secondMethod(firstMethod(1));
    }

}

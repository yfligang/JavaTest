package com.liepin.rim.org.day01.test15;

public class HowToLearnJava {

    private String str1 = "1011";
    private String str2 = "1012";
    private int num1 = 0;
    private int num2 = 1;

    public void method01(String str){
        //有参普通方法
        this.str1 = str;
        System.out.println(1 + " " + str1);
    }

    public HowToLearnJava(){
        //无参构造方法

    }

    public HowToLearnJava(String str){
        //有参构造方法
//        str = this.str1;
//        System.out.println(str);
//        System.out.println("================================");
//        this.str1 = str;
//        System.out.println(str);
        System.out.println("有参构造函数" + str1);
    }

    public void method01(){
        //无参普通方法
        System.out.println(str1);
    }



    public static void main(String[] args){

    }
}

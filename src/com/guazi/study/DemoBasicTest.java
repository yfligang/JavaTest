package com.guazi.study;

public class DemoBasicTest {

    public static void main(String[] args){
        //字符串常量
        System.out.println("ABC");

        int num = (int)10000000000000000L;  //出现数据溢出的情况  1874919424
        System.out.println(num);

        char c = 'A'; //字符型变量
        System.out.println(c + 100); //有一个翻译的动作
    }
}

package com.guazi.study;

public class DemoBasicTest {

    public static void main(String[] args){
        //字符串常量
        System.out.println("ABC");

        int num = (int)10000000000000000L;  //出现数据溢出的情况  1874919424
        System.out.println(num);

        char c = 'A'; //字符型变量
        System.out.println(c + 100); //有一个翻译的动作

        String str = "Hello";
        System.out.println(str + 1);

        int num1 = 100;
        int result = num1--;
        System.out.println(result); //先显示再减 100
        System.out.println(num1); //99

        int num2 = 100;
        int result1 = --num2;
        System.out.println(result1); //先减再显示 99
        System.out.println(num2); //99   31 11 19

        int number = 99;

        switch(number){
            case 50:
                System.out.println("考试不及格");
                break;
            case 60:
                System.out.println("考试及格");
                break;
            case 100:
                System.out.println("得了满分");
                break;
            default:
                System.out.println("我说了算");
        }

    }
}

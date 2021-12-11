package com.liepin.rim.org.day05;

import java.util.Scanner;

public class First {
    /*
    指定考试成绩，判断成绩的等级
    90~100 优秀
    80~89 好
    70~79 良
    60~69 及格
    60以下 不及格
     */

    //不能使用swith语句，是一个数的范围

    private static final String str1 = "优秀";
    private static final String str2 = "好";
    private static final String str3 = "良";
    private static final String str4 = "及格";
    private static final String str5 = "不及格";

    //可以尝试用java的枚举

    //从键盘中输入一个数字
    public static int secondMethod(){
        int num = 0; //方法体中局部变量最好先赋值
        System.out.println("请输入数字");
        Scanner scanner = new Scanner(System.in);
        //判断是否还有输入
        if (scanner.hasNextInt()){
            //判断输入的是否为整数
            num = scanner.nextInt();
            //接收整数
            System.out.println("输入的数据为 " + num);
        }
        scanner.close();
        return num;
    }

    public static void firstMethod(int num){
        if (num >= 90){
            System.out.println(num + " " + str1);
        }else if (num >= 80){
            System.out.println(num + " " + str2);
        }else if (num >= 70){
            System.out.println(num + " " + str3);
        }else if (num >= 60){
            System.out.println(num + " " + str4);
        }else {
            System.out.println(str5);
        }
    }

    public static void third(){
        //三元运算符 a?b:c a为boolean值，当true选择b,当false选择c
        int num = 1 > 2 ? 5 : 10;
        System.out.println(num);
    }

    //switch功能使用
    public static void four(int num){
        switch (num){
            case 1:
                System.out.println(num + "1");
                break;
            case 2:
                System.out.println(num + "2");
                break;
            case 3:
                System.out.println(num + "3");
                break;
            //switch是使用default来作为最后兜底的
            default:
                System.out.println(num + "不在该选项中");
                break;
        }
    }



    public static void main(String[] args){
        //firstMethod(secondMethod());
        //third();
        four(2);
    }
}

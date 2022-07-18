package com.liepin.rim.org.day10.test01;

import java.util.Scanner;

public class Test0001 {

    //对学生成绩大于 60分的， 输出 "合格"； 低于60分的，输出 "不合格"，提示 成绩/分数
    /*
    这里如果要使用switch, 就必须使用 case + 常量这种，不能是一个区间范围
    可以让输入的分数和60相除，查看下所得的结果是不是大于等于1
    如果大于等于1，说明分数等于60或者大于
    如果小于1，说明分数小于60
     */

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的分数");
        int num = scanner.nextInt();
        int num1 = (int)num/60;
        if (num <= 100){
            switch (num1) {
                case 1:
                    System.out.println("合格");
                    break;
                case 0:
                    System.out.println("不合格, " + "成绩为 " + num);
                    break;
                default:
                    System.out.println("请输入0~100分数");
            }
        }else {
            System.out.println("请输入0~100分数");
        }

    }
}

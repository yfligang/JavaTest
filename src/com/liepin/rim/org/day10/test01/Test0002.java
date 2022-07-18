package com.liepin.rim.org.day10.test01;

import java.util.Scanner;

public class Test0002 {
    //根据指定月份，打印该月份所属的季节 345春季 678夏季 91011秋季 1212冬季
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入对应的月份");
        int num = scanner.nextInt();
        if (num > 0 && num < 13){
            switch (num){
                case 1:
                case 2:
                case 12:
                    System.out.println("冬天");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("春天");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("夏天");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("秋天");
                    break;
            }
        }else {
            System.out.println("请输入正确的年份1~12");
        }

    }
}

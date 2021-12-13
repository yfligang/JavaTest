package com.liepin.rim.org.day05;

import java.util.Random;
import java.util.Scanner;

public class Five {

    /*
    猜数字游戏，随机一个数，然后用户输入一个数，如果随机的数比用户输入的数大，就提示数小了
    如果随机的数比用户输入的数小，就提示数大了
     */

    //随机[1,num]中的一个数
    public static int firstMethod(int num){
        Random random = new Random();
        int m = random.nextInt(num) + 1; //确保随机数字为 1~num
        return m; //返回随机产生的这个数
    }

    //判断用户输入的数字和随机的数字进行比较
    public static void secondMethod(int num){
        //定义输入的数字，给一个初始值0
        int n = 0;
        System.out.println("请输入数字: ");
        Scanner scanner = new Scanner(System.in);
        //判断是否已经输入了数字
        while (true){
            if (scanner.hasNextInt()){
                n = scanner.nextInt();
                if (n < num){
                    System.out.println("您猜小了");
                }else if (n > num){
                    System.out.println("您猜大了");
                }else {
                    System.out.println("恭喜您，猜对了");
                    break;
                }
            }else {
                System.out.println("不要输入字符串，请重新输入");
            }
        }

    }

    public static void main(String[] args){
        secondMethod(firstMethod(10));
    }
}


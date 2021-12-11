package com.liepin.rim.org.day05;

import java.util.Random;

public class Three {
    /*
    根据int变量n的值，来获取随机数字，范围是 [1,n]
    random.nextInt(n) 获取的值为 0~n-1 如果想获取[1,n] ，需要将随机的值 +1
     */

    public static void firstMethod(int num){
        Random random = new Random();
        int m = random.nextInt(num); //m值的范围为 [0, num) 即 [0, num-1]
        int n = random.nextInt(num) + 1; //n值的范围为 [1, num+1) 即[1, num]
        System.out.println("不加1时随机数值为: " + m);
        System.out.println("加1时随机数 值为: " + n);


//        Random random = new Random(100);
//        int num = random.nextInt(2);
//        System.out.println(num);
//        random.ints(1,2);
//        int r_num = random.nextInt(num); //nextInt(num)  从0到num, 不包含num [0,m)
//        int num02 = random.nextInt(num);
//        System.out.println(r_num);
//        System.out.println(num02);
    }

    public static void main(String[] args){
        firstMethod(1);
    }
}

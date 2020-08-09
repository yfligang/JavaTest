package WeekendTest;

import java.util.Random;

public class MathTestDemo {

    public static void main(String[] args) {
        //方法一，使用Math类  随机生成100个100以内的整数
        int arr1[] = new int[100];
        for (int i = 0; i < 100; i++) {  //循环次数，即生成多少个数字
            arr1[i] = (int)(Math.random()*100);
        }
        for (int num:arr1
             ) {
            System.out.println(num);
        }

        System.out.println("---分割符---");


        //随机生成100个100以内的整数  方法2 random
        Random random = new Random();
        int[] arr2 = new int[100];

        for (int i = 0; i < 100; i++) {
            arr2[i] = random.nextInt(100);
        }

        for (int num:arr2
             ) {
            System.out.println(num);
        }

    }
}

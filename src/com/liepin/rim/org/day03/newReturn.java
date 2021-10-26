package com.liepin.rim.org.day03;

public class newReturn {

    public static void main(String[] args){
        int i = 10;
        int j = 21;
        max(i,j);
    }

    //比较两个数的大小，取较大的值并显示出来
    public static int max(int num1,int num2){
        int max;
        if (num1 > num2) {
            max = num1;
            System.out.println("最大值为: " + max);
        } else {
            max = num1;
            System.out.println("最大值为: " + max);
        }
        return max;
    }
}

package com.liepin.rim.org.day06;

public class Two {
    //四种不同方法重载
    //首先是int
    public static boolean isSame(byte a,byte b){
        if (a == b){
            System.out.println("byte是相等的");
            return true;
        }else {
            System.out.println("byte是不相等的");
            return false;
        }
    }

    public static boolean isSame(int m,int n){
        if (m == n){
            System.out.println("int是相等的");
            return true;
        }else {
            System.out.println("int是不相等的");
            return false;
        }
    }

    public static boolean isSame(short x,short y){
        if (x == y){
            System.out.println("short是相等的");
            return true;
        }else {
            System.out.println("short是不相等的");
            return false;
        }
    }

    public static boolean isSame(double j,double k){
        if (j == k){
            System.out.println("double是相等的");
            return true;
        }else {
            System.out.println("double是不相等的");
            return false;
        }
    }

    public static boolean isSame(int a,String str){
        if (str.equals(a)){
            System.out.println("一样大");
            return true;
        }else {
            System.out.println("不一样大");
            return false;
        }
    }

    public static void main(String[] args){
        byte a = 1;
        byte b = 2;
        isSame(a,b);

        short x = 1;
        short y = 2;
        isSame(x,y);

        int m = 1;
        int n = 2;
        isSame(m,n);

        double j = 1;
        double k = 2;
        isSame(j,k);

        int ac = 10;
        String str = "Hello,world!";
        isSame(a,str);
    }

    /*
    对于方法重载，只判断方法名，和方法返回值、参数个数等都没关系
     */


}

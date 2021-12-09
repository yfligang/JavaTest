package com.liepin.rim.org.day04;

public class Two {

    public Two(){
        System.out.println(2);
    }
    //普通方法
    public void Two(){
        System.out.println(1);
    }

    public static void main(String[] args){
        Two two = new Two();
        two.Two();
        SuiBian.phone(1);
        int m  = 1 >> 2;
        System.out.println(m);
        int n = 100 >>> 2;
        System.out.println(n);
    }

}

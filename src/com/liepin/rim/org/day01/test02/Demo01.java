package com.liepin.rim.org.day01.test02;

public class Demo01 extends Thread{

    public static void main(String[] args){

    }

    @Override
    public void run(){
        //遍历100以内的偶数
        for (int i = 0;i < 101;i++){
            if (i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + i);
            }
        }
    }

    public void run(int num){
        System.out.println(Thread.currentThread().getName() + num);
    }

}

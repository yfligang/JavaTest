package com.liepin.rim.org.day01.test09;
/*
  读取某个项目
 */
public class SuiBianXie {

    public void method01(){
        System.out.println(2);
    }

    public SuiBianXie(){
        System.out.println("打印无参构造函数");
    }

    public void method(int x,int y,int z){
        int m;
        m = (z < 1) ? x : y;
        System.out.println(m);
    }

    public void cool(){
        method(1,2,3);
    }

    public static void main(String[] args){

    }


}

package com.guazi.test;

public class OverLoading {

    public int test(){
        System.out.println("test1");
        return 1;
    }

    public void test(int a){
        System.out.println("test2");
    }

    //以下两个参数类型顺序不同
    public String test(int a,String s){
        System.out.println("test3");
        return "returnTest3";
    }

    public String test(String s,int a){
        System.out.println("test4");
        return "returnTest4";
    }

    public static void main(String[] args) {
        OverLoading ol = new OverLoading();
        ol.test();
        ol.test(1);
        ol.test(1,"1");
        ol.test("1",1);
    }
}

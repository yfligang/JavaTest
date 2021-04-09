package com.liepin.rim.org.day01.test06;

public class TestDemo06 {

    public TestDemo06(){
        System.out.println("无参构造函数");
    }

    public static void main(String[] args){
        PrivateMethod.SonOfPrivateMethod sopm = new PrivateMethod.SonOfPrivateMethod();
        sopm.runPrivateMethod();
    }
}

package com.liepin.rim.org.day01.test03;

public class FuInterImpl implements FuInter {

    private int age;

    @Override
    public void method() {
        System.out.println("接口的方法不带参");
    }

    @Override
    public void method(int age) {
        this.age = age;
        System.out.println("接口的放带参 " + age);
    }

    public static void main(String[] args){
        FuInter fuInter = new FuInterImpl();
        fuInter.method(100.0);

        FuInter.method("Hello");
    }





}

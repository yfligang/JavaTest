package com.test.hello;

public class AbstractTest implements FunnyTest,TestGua {

    private int num;

    @Override
    public void funny() {
        System.out.println("hello,world");
        try {
            System.out.println("hello");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public int cool(int newNum) {
        this.num = newNum;
        return num;
    }

    @Override
    public void lucy() {
        System.out.println("一个类可以继承多个接口");
    }

    public static void main(String[] args) {
        AbstractTest abstractTest = new AbstractTest();
        abstractTest.cool(100);
        abstractTest.lucy();
        abstractTest.funny();
    }
}

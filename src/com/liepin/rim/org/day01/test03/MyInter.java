package com.liepin.rim.org.day01.test03;

import javax.management.monitor.Monitor;

public interface MyInter extends FuInter{
    //接口如果需要继承另外的接口，也是使用 extends 不能使用 implements
    @Override
    void method();

    @Override
    void method(int age);

    public int value(int age);

    public class MyInterImpl implements MyInter{

        @Override
        public void method() {

        }

        @Override
        public void method(int age) {

        }

        @Override
        public int value(int age) {
            return 0;
        }
    }
}

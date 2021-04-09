package com.liepin.rim.org.day01.test07;

import java.util.concurrent.FutureTask;

public class TestDemo {

    public static void main(String[] args) throws Exception {
        CallableInterImpl cii = new CallableInterImpl();
        FutureTask ft = new FutureTask(cii);

        Thread td1 = new Thread(ft,"第三种获取线程的方式");
        td1.start();
        System.out.println("获取第三种线程的方式的名称: " + ft.get());

        Thread td2 = new Thread(ft,"又一种多线程获取方式");
        td2.start();
        System.out.println("获取又一种多线程获取方式名称: " + ft.get());

    }
}
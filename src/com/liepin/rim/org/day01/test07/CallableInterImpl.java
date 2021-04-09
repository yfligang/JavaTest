package com.liepin.rim.org.day01.test07;

import java.util.concurrent.Callable;

//实现下Callable接口的功能
public class CallableInterImpl implements Callable {

    @Override
    public Object call() throws Exception {
        System.out.println("调用Callable来实现多线程方法");
        for (int i = 0; i < 100; i++) {
            if (Thread.currentThread().getName().equals("第三种获取线程的方式")){
                Thread.sleep(15);
            }
            System.out.println(Thread.currentThread().getName() + "获取第 " + i + " 个值");
        }
        return 1024;
    }

    public CallableInterImpl(){
        System.out.println("无参构造方法");
    }
}

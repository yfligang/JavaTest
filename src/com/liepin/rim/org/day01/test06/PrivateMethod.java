package com.liepin.rim.org.day01.test06;

public class PrivateMethod {

    private PrivateMethod(){
        System.out.println("父类的私有构造函数");
    }

    public void runPrivateMethod(){
        System.out.println("runPrivateMethod方法");
    }

    public static class SonOfPrivateMethod extends PrivateMethod {
        public SonOfPrivateMethod(){
            System.out.println("即使父类是私有构造函数，子类也可以继承");
        }
    }
}

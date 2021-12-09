package com.liepin.rim.org.day04;

import java.util.ArrayList;
import java.util.Vector;

public class InstanceofDemo {

    public static void main(String[] args){
        //新建了一个ArrayList类的对象，赋值给 Pbject
        Object testObject = new ArrayList();
        displayObjectClass(testObject);
    }

    public static void displayObjectClass(Object o){
        if (o instanceof Vector){
            System.out.println("对象是 java.util.Vector 类的实例");
        } else if (o instanceof ArrayList){
            System.out.println("对象是 java.util.ArrayList 类的实例");
        } else {
            System.out.println("对象是 " + o.getClass() + " 类的实例");
        }




    }
}
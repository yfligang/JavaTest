package com.test.hello;

import ProtectedTest2.Funny;
import WorkStudy.StudayWork.AbstractDemo;

public class RunEnTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(1);
        person.setName("Hello");
        person.getAge();
        person.getName();
        person.test();

//        EnCapTest enCapTest = new EnCapTest();
//        enCapTest.setAge(20);
//        enCapTest.setName("James"); //通过set赋值，通过get取值
//        enCapTest.setIdNum("12343ms");
//        System.out.println("Name: " + enCapTest.getName() + " Age: " + enCapTest.getAge());
//
//        AbstractTest abstractTest = new AbstractTest();
//        abstractTest.funny();
//        System.out.println(abstractTest.cool(100));
        //FunnyTest funnyTest = new FunnyTest();
    }


}

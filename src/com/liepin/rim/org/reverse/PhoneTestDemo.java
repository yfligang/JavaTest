package com.liepin.rim.org.reverse;

public class PhoneTestDemo {
    //创建一个方法，调用Phone类中的成员变量

    public static void phoneTest(){
        Phone phone = new Phone();
        phone.setName("Hello");
        phone.setAge(20);
        phone.setCa('C');
        phone.getName();
        phone.getAge();
        phone.getCa();
    }

    public static void main(String[] args){
        phoneTest();
    }
}

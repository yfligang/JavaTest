package com.liepin.rim.org.day03;

public class PhoneDemo {

    public static void main(String[] args) {
        Phone phone = new Phone();
        cool(phone);
        Phone phone1 = new Phone();
    }

    public static void cool(Phone phone){
        System.out.println(phone.age);
        System.out.println(phone.str);
        System.out.println(phone.isSame);
        System.out.println(phone.arrayNum);
        System.out.println(phone.arrayStr);
    }
}

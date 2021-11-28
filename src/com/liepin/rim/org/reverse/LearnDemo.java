package com.liepin.rim.org.reverse;

public class LearnDemo {

    public static Phone learnMore(Phone phone){
        Phone phone1 = new Phone();
//        Phone.setCa('C');
//        Phone.setAge(200);
//        Phone.setName("LHX");
        System.out.println(Phone.getAge());
        System.out.println(Phone.getCa());
        System.out.println(Phone.getName());
        return phone1;
    }

    public static void main(String[] args){
        Phone phone = new Phone();
        learnMore(phone);
    }
}

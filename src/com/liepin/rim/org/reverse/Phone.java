package com.liepin.rim.org.reverse;

public class Phone {

    private static String name = "China";
    private static int age = 20;
    private static char ca = 'A';

    public static String getName() {
        System.out.println(name);
        return name;
    }

    public static void setName(String name) {
        Phone.name = name;
    }
    public static int getAge(){
        System.out.println(age);
        return age;
    }
    public static void setAge(int age) {
        Phone.age = age;
    }

    public static char getCa() {
        System.out.println(ca);
        return ca;
    }

    public static void setCa(char ca) {
        Phone.ca = ca;
    }
}

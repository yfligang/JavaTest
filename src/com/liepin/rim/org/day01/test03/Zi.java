package com.liepin.rim.org.day01.test03;

public class Zi extends Fu{
    public int age = 20;
    private String name;
    public void method(){
        System.out.println("子类的方法");
    }

    @Override
    public String getName() {
        name = "子类的" + name;
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}

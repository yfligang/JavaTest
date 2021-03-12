package com.liepin.rim.org.day01.test03;

//尝试下成员方法/成员变量的调用
public class Fu {
    public int age = 10;
    private String name;
    public void method(){
        System.out.println("父类的方法");
    }

    public String getName() {
        name = "父类的" + name;
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

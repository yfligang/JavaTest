package com.test.hello;

public class Person {

    private String name;
    private int age;

    //对每个值属性提供对外的公共方法访问


    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void test(){
        System.out.println("Person类的名字 " + getName() + " Person类的年龄 " + getAge());
    }
}

package com.guazi.test;

public class Dog extends Animal {

    private int num;

    public void move(){
        System.out.println("狗不仅可以跑也可以走");
    }

    public int cry(int num){
        this.num = num;
        return num;
    }

    public String gets(String s){
        String s1 = "hello";
        System.out.println(s1);
        return s;
    }

    public void gots(String s){
        if (s == "hello"){
            return ;
        }

        System.out.println("world!");
    }

    public static void main(String[] args) {
        Animal animal = new Dog();
        Dog dog = new Dog();
        //animal.move();
        //dog.gets("1");
        //dog.cry(1);
        dog.gots("hello");

        animal.setter();
        animal.getter();

        dog.run();

        //dog.cry(1);
    }

    private void run(){
        System.out.println(2);
    }


}

package com.guazi.test;

public class TestDog {

    public static void main(String[] args) {
        Animal animal = new Animal(); //Animal对象
        Animal animal1 = new Dog(); //Dog对象

        Dog dog = new Dog();

        animal.move();
        animal1.move();
        dog.move();

    }
}

package com.guazi.study;

public class Test {

    public static void main(String[] args) {
        show(new Cat());
        show(new Dog());

        Animal animal = new Cat();
        animal.eat();

        Cat c = (Cat) animal;


        Animal animal1 = new Dog();
        animal1.eat();
    }

    public static void show(Animal animal){
        animal.eat();
        //类型判断
        if (animal instanceof Cat){
            Cat c = (Cat) animal; //Cat的类
            c.work();
        }
        else if (animal instanceof Dog){
            Dog d = (Dog) animal;
            d.work();
        }
    }

}

abstract class Animal{
    abstract void eat(); //抽象方法
}

class Cat extends Animal{
    @Override
    void eat() {
        System.out.println("吃鱼");
    }

    public void work(){
        System.out.println("抓老鼠");
    }
}

class Dog extends Animal{
    @Override
    void eat() {
        System.out.println("吃骨头");
    }

    public void work(){
        System.out.println("看家");
    }
}
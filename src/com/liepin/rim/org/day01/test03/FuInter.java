package com.liepin.rim.org.day01.test03;
//命名一个接口
public interface FuInter {

    //创建一个方法
    public void method();

    public void method(int age);

    /*
    接口中只能有抽象方法，且抽象方法没有body 1.8以前
    1.8到1.8以后，可以创建默认方法/正常方法，实现类不需要实现正常方法
    需要创建一个实现类来实现接口中的方法
     */

    default String method(String name){
        return name;
    }

    default void method(double max){
        System.out.println(max);
    }

    public class FuInterImpl implements FuInter{

        @Override
        public void method() {

        }

        @Override
        public void method(int age) {

        }

    }

}

package cool_test_demo;

public class Dog extends Animal {

    void cat(){
        System.out.println("狗的子类方法");
    }

    //定义一个父类中没有的方法
    void run(){
        System.out.println("狗能跑");
    }
}

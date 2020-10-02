package cool_test_demo;

import extendsTest.Mouse;

public class TestDemo {

    public static void main(String[] args){
        //子类调用父类该方法
        Animal al1 = new Animal();
        al1.cat();

        Animal al2 = new Dog();
        al2.cat();

        Animal al3 = new Cat();
        al3.cat();

        //子类实例化对象引用父类
        //Dog dog1 = new Animal();

        //Test类中子类实例化子类引用对象
        Dog dog2 = new Dog();
        dog2.cat();
        dog2.run();
    }
}

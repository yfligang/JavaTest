package TianAnMen;

import java.io.IOException;

public class ClassDemo1 {

    public static void main(String[] args) {
        //类Foo的实例对象如何表示
        Foo foo = new Foo();
    /*Foo这个类也是一个实例对象， Class类的实例对象
      第一种方法:
     */
        Class c1 = Foo.class; //任何一个类都有一个隐含的静态成员变量class
        //第二种方法
        Class c2 = foo.getClass();

        //不管c1 or c2都代表了Foo类的类类型，一个类只可能是Class类的一个实例对象
        System.out.println(c1 == c2); //竟然是true， 这是为什么？

        //第三种表达方式
        Class c3 = null;
        try {
            c3 = Class.forName("TianAnMen.Foo");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

        System.out.println(c2 == c3);

        try {
            Foo foo1 =  (Foo)c1.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }




}

class Foo{ //类是一个对象，
    void cool(){
        System.out.println("你好");
    }
}

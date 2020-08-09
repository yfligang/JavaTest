package interface_test.com;

public class TestSuperSub {

    public static void main(String[] args) {
        System.out.println("------SubClass类继承------");
        SubClass sc1 = new SubClass(); //调用  SuperClass() +SubClass() 先调用父类的无参构造方法，再调用子类的无参构造方法
        SubClass sc2 = new SubClass(100); //先调用父类的有参构造方法，再调用子类的有参构造方法

        System.out.println("------SubClass2类继承------");
        SubClass2 sc3 = new SubClass2(); //无参，调用的subClass2的无参构造方法,然后又调用了父类的有参构造方法
        SubClass2 sc4 = new SubClass2(200); //调用的subClass2的有参构造方法,
    }



}

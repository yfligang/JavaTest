package interface_test.com;

import jdk.internal.instrumentation.TypeMapping;

public class SubClass2 extends SuperClass {
    private int n;

    SubClass2(){
        super(300); //调用父类中带有参数的构造器
        System.out.println("SubClass2");
    }

    SubClass2(int n){ //自动调用父类的无参构造器
        System.out.println("SubClass2(int n)" + n);
        this.n = n;
    }


}

package interface_test.com;

public class SubClass extends SuperClass {

    private int n;

    SubClass(){ //无参构造方法  自动调用父类的无参构造器
        System.out.println("SubClass");

    }

    SubClass(int n){
        super(300); //子类通过super方法调用父类的有参构造方法
        System.out.println("SubClass(int n)" + n);
        this.n = n;

    }


}

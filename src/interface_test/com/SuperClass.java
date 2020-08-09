package interface_test.com;

public class SuperClass {

    private int n;

    //无参构造方法
    SuperClass(){
        System.out.println("SuperClass()");
    }

    //有参构造方法
    SuperClass(int n){
        System.out.println("SuperClass(int n)");
        this.n = n ; //将有参构造函数中的参数赋值给类变量
    }
}

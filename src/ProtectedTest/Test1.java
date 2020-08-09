package ProtectedTest;


public class Test1 {

    public Test1(){
        System.out.println("Test1的构造方法");
    }

    String name;
    //包BasciFunction的类ProtectedTest的方法f
    protected void f(){

    }

    public final void test(){
        System.out.println("final修饰的方法");
    }

    public final String pup(){
        return "Hello_world!";
    }

    final void fun(){
        System.out.println("cool");
    }
}

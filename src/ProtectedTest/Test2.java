package ProtectedTest;
//包ProtectedTest中的类Test2,继承于同一个包下的Test1类
public class Test2 extends Test1 {

    public static void main(String[] args){

        Test2 test2 = new Test2();
        test2.pup();
        test2.test();
    }

//    final void fun(){
//
//    }

//    public final void test(){    提示不能继承final的方法
//
//    }
}

package ProtectedTest;

import ProtectedTest2.Test3;

//包ProtectedTest的类Test4
public class Test4 {

    public static void main(String[] args){
        Test2 test2 = new Test2();
        test2.f();
        //test2.clone();

        Test3 test3 = new Test3();
        test3.f();
        //test3.clone();
    }
}

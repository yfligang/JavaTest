package ProtectedTest3;

import com.sun.xml.internal.bind.v2.model.impl.ClassInfoImpl;
import sun.misc.ClassFileTransformer;

public class CommandLine {

    public CommandLine(){
        System.out.println("hello");
    }

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "]: " + args[i]);
        }

        CommandLine cl = new CommandLine();
        //MyClass mc = cl.new MyClass(); //调用成员内部类
        YouClass yc = new YouClass();


    }

    static class YouClass{

        YouClass(){
            System.out.println("YouClass");
        }
    }
}




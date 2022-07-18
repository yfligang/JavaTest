package com.liepin.rim.org.day10.test01;

public class Teacher {
    static {
        System.out.println("父类的static代码块001");
    }

    static {
        System.out.println("父类的static代码块002");
    }

    public Teacher() {
        System.out.println("Teacher类的无参构造方法");
    }

    public void function01(){
        System.out.println("Teacher类的普通方法");
    }

    public static void main(String[] args){
//        int a = 1;
//        int b = 100;
//        b = 89;
//        System.out.println(a);
//        System.out.println(b); //89

        char c = 'A';
        char d = 'a';
        char e = 101;
        System.out.println(c);
        System.out.println(c + 1);
        System.out.println(d);
        System.out.println(d + 1);
        System.out.println(e);
        System.out.println(e + 1);  //102
    }
}

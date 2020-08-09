package com.test.cool;

public class Father {

    public static int f_1 = 1;
    public static String f_2 = "父类的常量";
    private static int f_3 = 2;
    private static String f_4 = "私有父类的常量";
    public int f_5 = 6;

    public Father(){ //父类无参构造方法
        System.out.println("父类无参构造方法");
    }

    public Father(String str){
        System.out.println("父类有参构造方法");
    }

    static {
        System.out.println("父类static1");
    }

    static {
        System.out.println("父类static2");
    }

    {
        System.out.println("父类普通代码快");
    }

    public void father(){
        System.out.println("父类普通方法");
    }
}

package com.liepin.rim.org.day06;

public class Four {

    public static void main(String[] args){
//        Three three = new Three();
//        String str = three.name;
//        int num = three.num;
//        System.out.println(num);
//        System.out.println(str);
        //这个Three类的对象three中保存的内容为: str和num

        //method(three);
        Three four = getThree(); //左边进行接收，赋值调用
        System.out.println(four.name);
        System.out.println(four.num);
    }

    public static void method(Three three){ //类的方法作为参数
        System.out.println(three.name);
        System.out.println(three.num);
    }

    public static Three getThree(){
        Three three = new Three();
        three.num = 100;
        three.name = "world!";
        return three; //谁调用了我，我就把类的对象three的地址传给谁
    }
}

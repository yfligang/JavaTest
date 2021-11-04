package com.liepin.rim.org.day01.test01;

public class Demo02Study {
    public static void main(String[] args){
        //导包: 需要使用的Student类，和自己Demo02Study类在同一个包下，可以省略导包语句

        //创建: 格式 类名 对象名 = new 类名();
        Student stu = new Student(); //根据Student类，创建了一个名为stu的对象

        //使用其中的成员变量，格式: 对象名.成员变量名  对象名.成员方法名

        System.out.println(stu.age);
        System.out.println(stu.name);
        System.out.println("===============================");

        //改变对象当中的成员变量数值内容
        //将右侧的字符串，赋值交给stu对象当中的name成员变量
        stu.name = "谭嗣同";
        //将右侧的数值，复制交给stu对象当中的age成员变量
        stu.age = 35;

        System.out.println(stu.age);
        System.out.println(stu.name);
        System.out.println("================");

        //对象的成员方法
        stu.eat();
        stu.sleep();
        stu.study();

    }



}

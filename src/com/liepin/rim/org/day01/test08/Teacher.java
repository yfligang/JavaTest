package com.liepin.rim.org.day01.test08;

import java.lang.reflect.Field;
import java.util.concurrent.locks.ReentrantLock;

public class Teacher extends Student{

    public static void main(String[] args) throws InstantiationException,IllegalAccessException,NoSuchFieldException,SecurityException{
        //利用反射获取属性 & 赋值
        //1.获取Student类的Class对象
        Class studentClass = Student.class;
        Class studentClass1 = Leetcode01.class;
        //2.通过Class对象创建Student类的对象
        Object mStudent = studentClass.newInstance();
        Object nStudent = studentClass1.newInstance();
        //3.通过Class对象获取Student类的name属性
        Field f = studentClass.getDeclaredField("name");
        Field m = studentClass1.getDeclaredField("str");
        //4.设置私有访问权限
        f.setAccessible(true);
        m.setAccessible(true);
        //5.对新创建的Student对象设置name值
        f.set(mStudent,"Carson");
        m.set(nStudent,"Hello");
        //6.获取新创建Student对象的name属性&输出
        System.out.println(f.get(mStudent));
        System.out.println(m.get(nStudent));
    }



}

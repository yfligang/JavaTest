package com.liepin.rim.org.day01.test08;

import sun.rmi.runtime.Log;

import java.lang.reflect.Field;

public class StudentName {

    public static String name;
    //利用反射调用类的构造函数
    public StudentName(){
        System.out.println("类的无参构造函数");
    }

    public StudentName(String str){
        str = this.name;
        System.out.println(str + "调用有参构造函数");
    }
}

class StudentLittle{

    public static void main(String[] args) throws NoSuchFieldException {
        //1. 获取StudentName类的Class对象
        Class st = StudentName.class;
        try{
            Object ot = st.newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        //获取属性
        Field f = st.getDeclaredField("name");
        f.setAccessible(true);

    }


}

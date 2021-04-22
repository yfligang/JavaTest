package com.liepin.rim.org.day01.test07;

import java.util.Vector;

public class VectorDemo {
    //Vector多用于多线程，线程安全
    public void method(int size){
        Vector<String> vector = new Vector<>();
        for (int i = 0; i < size; i++) {
            vector.add("Cool" + i);
        }

        vector.add(1,"LG");
        boolean bl = vector.contains("Cool8");
        vector.remove("Cool11111");
        if (vector.contains("Cool7")){
            vector.remove("Cool7");
        }
        System.out.println(bl);

        for (String str:vector
             ) {
            System.out.print(str + " ");
        }

        System.out.println("\n" + "集合的长度 " + vector.size());
    }

    public static void main(String[] args){
        VectorDemo vtd = new VectorDemo();
        vtd.method(10);
    }
}

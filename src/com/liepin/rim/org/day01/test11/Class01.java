package com.liepin.rim.org.day01.test11;

import java.util.ArrayList;
import java.util.HashMap;

public class Class01 {
    //ArrayList和Hashmap的用法
    public void arrayListMethod(int size){
        ArrayList<Integer> array01 = new ArrayList<>();
        if (array01.size() < 0 || array01.size() > size){
            return;
        }else {
            for (int i = 0; i < size; i++) {
                array01.add(i);
            }
        }
        System.out.println(array01);

    }

    public void hashMapMethod(int key,String value,int size){
        HashMap<Integer,String> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            map.put(key + i,value + i);
        }

        String name = "map的value为: ";
        for (int i = 0; i < map.size(); i++) {
            if (i == 0){
                System.out.println(name + map.get(1));
            }else {
                System.out.println(map.get(i));
            }
        }

        System.out.println(map);
    }




    public static void main(String[] args){
        Class01 c1 = new Class01();
        c1.arrayListMethod(10);
        c1.hashMapMethod(1,"LG",10);


    }
}

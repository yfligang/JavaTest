package com.liepin.rim.org.day07;

import java.util.HashMap;

public class Two02 {

    public static void main(String[] args){
        HashMap<One01,Integer> hashMap = new HashMap<>();
        One01 one01 = new One01();
        one01.method01("Hello");
        hashMap.put(one01,1);
        System.out.println("================================");

        for (One01 one011:hashMap.keySet()
             ) {
            System.out.println(one011.name + " " + one011.age);
            one011.method01("cool");
        }
    }
}

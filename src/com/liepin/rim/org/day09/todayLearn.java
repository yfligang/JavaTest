package com.liepin.rim.org.day09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class todayLearn {

    public static void func(){
        int n[][] = {{8,7,9},{9,1},{15,0,-3,16}};

        for (int i = 0; i < n.length; i++) {
            System.out.println(Arrays.toString(n[i]));
        }
//        List list = new ArrayList();
//        list.add("{8,7,9}");
//        list.add("{9,1}");
//        list.add("{15,0,-3,16}");
//
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
    }

    public static void main(String[] args){
        func();
    }
}

package com.liepin.rim.org.day02;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.util.ArrayList;
import java.util.HashMap;

public class IpNum {

    public static void method(){

//        String[] str = {"1","2"};
//
//        String[][] str1 = {["1","10.19.1.23"],[]}

        String[][] str = new String[3][2];
        str[0][0] = "1";
        str[0][1] = "10.12.110.17";

        System.out.println(str);

        for (String[] row:str
             ) {
            for (String str1:row
                 ) {
                System.out.println(str1);
            }
        }
    }

    public static void main(String[] args){
        method();
    }
}



package com.liepin.rim.org.day02;

public class SonOfFather extends Learn1014 {

    public void fatherMethod(){
        System.out.println(1000);
    }

    public String function(String str){
        String str1 = "name";
        String str2 = str1 + str;
        return str1;
    }

    public static void main(String args){
        Learn1014 learn1014 = new SonOfFather();
        learn1014.fatherMethod(100);
    }
}

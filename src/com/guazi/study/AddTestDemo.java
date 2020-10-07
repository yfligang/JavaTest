package com.guazi.study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class AddTestDemo {

    public static void main(String[] args) throws Exception{
        BufferedWriter bw = new BufferedWriter(new FileWriter("demo1.txt"));
        bw.write("aString\n");
        bw.close();

        bw = new BufferedWriter(new FileWriter("demo1.txt",true));
        bw.write("aStrng");
        bw.close();

        BufferedReader br = new BufferedReader(new FileReader("demo1.txt"));
        String str;
        while((str = br.readLine()) != null){
            System.out.println(str);
        }
        br.close();
    }
}

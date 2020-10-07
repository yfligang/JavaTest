package com.guazi.study;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static java.lang.System.in;

public class TestReadTest {

    public static void main(String[] args){

        try{
            BufferedReader br = new BufferedReader(new FileReader("test1.txt"));
            String str;
            while((str = br.readLine()) != null){
                System.out.println(str);
            }
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}

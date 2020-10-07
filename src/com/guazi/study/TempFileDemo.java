package com.guazi.study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class TempFileDemo {

    public static void main(String[] args) throws Exception{
        File temp = File.createTempFile("demo2",".txt");
        System.out.println("文件路径:" + temp.getAbsolutePath());
        temp.deleteOnExit();
        BufferedWriter bw = new BufferedWriter(new FileWriter(temp));
        bw.write("aString");
        System.out.println("l临时文件以创建: ");
        bw.close();
    }
}

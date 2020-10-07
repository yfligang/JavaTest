package com.guazi.study;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class FileOutput {

    public static void main(String[] args){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("test1.txt")); //新创建一个文件
            //会抛出异常，需要使用try-catch来捕获异常.接下来就是向文件中输入内容
            //bw.write(100);
            bw.write("hello,world");
            bw.write("\n");
            bw.close();
            System.out.println("文件创建成功");

        }catch (Exception e){
            e.printStackTrace();
        }


    }
}

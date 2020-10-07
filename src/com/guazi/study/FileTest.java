package com.guazi.study;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {

    public static void main(String[] args){
        //新建一个文件
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/lg/Desktop/test1.txt"));
            bw.write("Who am I?");
            bw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        //查看文件是否存在
        File file = new File("/Users/lg/Desktop/test1.txt");
        if (file.exists()){
            System.out.println("文件存在");
            //如果存在，删除文件
            file.delete();
            if (file.exists() == false)
            System.out.println("文件被删除");
        }
    }

}

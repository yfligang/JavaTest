package com.guazi.study;

import java.io.*;

public class FileCopyDemo {

    public static void main(String[] args) throws IOException {
        //新创建一个文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("test_demo.txt"));
        //向文件中写入内容
        bw.write("Copy the information from File A to File B");
        //关闭创建文件
        bw.close();
        InputStream is = new FileInputStream(new File("test_demo.txt"));
        OutputStream os = new FileOutputStream(new File("demo_test.txt"));
        byte[] buf = new byte[1024];
        int len;
        while((len = is.read(buf)) > 0){
            os.write(buf,0,len);
        }

        is.close();
        os.close();
        BufferedReader is1 = new BufferedReader(new FileReader("demo_test.txt"));
        String str;
        while((str = is1.readLine()) != null){
            System.out.println(str);
        }
        is1.close();
    }


}

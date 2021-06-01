package com.liepin.rim.org.day01.test10;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Sunshine {

    boolean v = true;

    public void method(int num) throws IOException {
        ArrayList list = new ArrayList();
        for (int i = 0; i < num; i++) {
            list.add(i);
        }

        OutputStream os = new OutputStream() {
            @Override
            public void write(int b) throws IOException {

            }
        };
        DataOutputStream dos = new DataOutputStream(os);
        System.out.println();

    }

    public static void main(String[] args){
        Sunshine ss = new Sunshine();
        try {
            ss.method(10);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

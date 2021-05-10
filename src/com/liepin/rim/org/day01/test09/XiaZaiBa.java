package com.liepin.rim.org.day01.test09;

public class XiaZaiBa extends SuiBianXie {

    public void method01(){
        System.out.println(1);
        method02();

    }

    public void method02(){
        super.method01();
    }

    public static void main(String[] args){
//        XiaZaiBa xzb = new XiaZaiBa();
//        SuiBianXie sbx = new SuiBianXie();
//        sbx.cool();

        SuiBianXie sb = new XiaZaiBa();
        //sb.cool();
        sb.method01();
        //不能向下兼容



    }

}

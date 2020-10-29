package com.guazi.study;

import java.util.ArrayList;
import java.util.List;

public class CharToShu {
    //快速找到字符串中第一个重复的字符
    public static void main(String[] args){
        //先将字符串转换为字符数组
        String str = "HelloWorld";
        char[] arg1 = new char[str.length()];
        //将字符串转为数组
        for (int i = 0; i < str.length(); i++) {
            arg1[i] = str.charAt(i);
        }
        for (char str1:arg1
             ) {
            System.out.println(str1);
        }

        //在字符数组中查找出现重复的元素
        for (int i = 0; i < arg1.length; i++) {
            for (int j = i + 1; j < arg1.length; j++) {
                if (arg1[i] == arg1[j]){
                    System.out.println("下标: " + i);
                }else {
                    System.out.println("不存在重复的元素");
                }
            }
        }



    }

}

//方法一使用了双重循环，将字符串转换为char数组，使用 xxx.charAt()方法
//现在想使用下一个循环
class TestSEcond{
    public static void main(String[] args){
        String str = "China,Beijing,Shanghai";
        //将String字符串转换为数组
        List list = new ArrayList();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }

        for (Object object:list
             ) {
            System.out.println(object);
        }


    }


}

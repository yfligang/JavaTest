package com.liepin.rim.org.day01.test13;

import java.util.ArrayList;

/*
查找相同字母组成的单词。
 */
public class FindSameWord {
    String name1 = "abc";
    String name2 = "xyz";
    String name3 = "exception";
    String name4 = "abc";
    String name5 = "123";
    String name6 = "abc";

    //查找和字符串str一样的字符串
    public void findSameWord(String str){
        ArrayList<String> array = new ArrayList<>();
        array.add(name1);
        array.add(name2);
        array.add(name3);
        array.add(name4);
        array.add(name5);
        array.add(name6);

        for (int i = 0; i < array.size() ; i++) {
            if (array.get(i).equals(str)){
                System.out.println("第 " + i + "个元素" + array.get(i) + "和输入的字符一致");
            }
        }

    }

    public static void main(String[] args){
        new FindSameWord().findSameWord("abc");
    }

}

package com.guazi.study;

import java.util.*;

public class DemoTestString {

    public static void main(String[] args){
        String str = "hello,world,high,lalala";
        //找到这个字符串中重复的元素并算出重复几次

        //先将字符串转换为字符数组
        char[] chars = str.toCharArray();
        for (char c:chars
             ) {
            System.out.println(c);
//            System.out.println(true);
//            System.out.println(false);
        }

        System.out.println("-----------------------");

        Map<Character,Integer> map = new HashMap();
        //使用循环获取字符数组中的所有字符
        for (Character character:chars
             ) {
            if(!map.containsKey(character)){
                map.put(character,1);
            }else {
                map.put(character,(map.get(character) + 1));
            }

        }

        //根据Map中的value值来删除Map中的元素
        Iterator<Map.Entry<Character,Integer>> it = map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<Character,Integer> entry = it.next();
            if (entry.getValue() == 1){
                it.remove();
            }
        }

        //如果需要删除Map中的数据，最好使用迭代器


        //打印Map内容
        for (Object obj:map.entrySet()
             ) {
            System.out.println(obj);
        }

    }
}

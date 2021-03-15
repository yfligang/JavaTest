package com.liepin.rim.org.day01.test03;

import javax.swing.text.html.HTMLDocument;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

//使用迭代器和for循环来获取map中的值
public class Demo02 {
    public static void main(String[] args){
        HashMap<String,String> map = new HashMap<>();
        map.put("黄晓明","杨幂");
        map.put("中国","美国");
        map.put("ABC","abc");

        Set<String> set = map.keySet(); //set集合
        //遍历有2种方式
        //方法一
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){ //判断迭代器中是否还有数值
            String key = iterator.next(); //map为String的，迭代器也是String的
            String value = map.get(key);
            System.out.println(key + " " + value);
        }
        //方法二
    }
}

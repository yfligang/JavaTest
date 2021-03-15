package com.liepin.rim.org.day01.test04;

import javax.swing.text.html.HTMLDocument;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
//将用户的名称和分数记录并保存下来
public class MapDemoTest {

    public static void main(String[] args){
        Map<String,Integer> map = new HashMap<>();

        map.put("张三",90);
        map.put("李四",88);
        map.put("王五",77);
        map.put("赵六",99);
        //打印map

        System.out.println(map);

        //将map中的所有key找出来并打印
        for (String key:map.keySet()
             ) {
            System.out.println("map对应的key为 " + key);
        }
        System.out.println("=============================>");
        //将map中的所有value找出来并打印
        for (int value:map.values()
             ) {
            System.out.println("map对应的value为 " + value);
        }
        System.out.println("=============================>");
        /*
        第一种遍历方法
         */
        for (Map.Entry<String,Integer> entry:map.entrySet()
             ) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println("map中的数据 " + key + " " + value);
        }
        System.out.println("=============================>");
        /*
        第二种遍历方法 Iterator
         */

        Iterator<Map.Entry<String,Integer>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String,Integer> entries = iterator.next();
            String key = entries.getKey();
            int value = entries.getValue();
            System.out.println("key为 " + key + "value为 " + value);

        }

    }
}
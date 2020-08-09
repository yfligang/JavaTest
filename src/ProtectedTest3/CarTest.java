package ProtectedTest3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CarTest {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        //向集合map中添加数据
        map.put("1","Hello");
        map.put("2","World");
        map.put("3","GuaZi");

        //获取map中的key元素
        System.out.println("map的key为 ");
        for (String str:map.keySet()
             ) {
            System.out.println(str);  //map.get(str)就是Key对应的value值
        }
        //获取map中的value值
        System.out.println("map的value值为 ");
        for (String str:map.values()
             ) {
            System.out.println(str);
        }

        System.out.println("换一种方法找到map的key和value值");
        for (String key:map.keySet()
             ) {
            System.out.println("map的key为 " + key + "map的value值为 " + map.get(key));
        }

        //第二种方法
        System.out.println("通过Map.entrySet使用iterator遍历key和value值");
        Iterator<Map.Entry<String,String>> it = map.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<String,String> entry = it.next();
            System.out.println("key= " + entry.getKey() + "and value= " + entry.getValue());
        }

    }
}

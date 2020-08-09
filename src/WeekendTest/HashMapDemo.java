package WeekendTest;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {
        //创建HashMap的对象 sites
        HashMap<Integer,String> sites = new HashMap<Integer, String>();
        //添加键值对
        sites.put(1,"Google");
        sites.put(2,"Baidu");
        sites.put(3,"Zhihu");
        sites.put(4,"JD");

        System.out.println(sites); //key-value键值对
        //根据key值获取对应的value值
        String key1 = sites.get(3);//当key为3时，找到map中对应的value值
        //获取所有的key值，可以将所有的key值弄成数组
        System.out.println("HashMap的key值");
        for (int key:sites.keySet()
             ) {
            System.out.println(key);
        }

        //获取所有的bvalues值
        System.out.println("HashMap的value值");
        for (String str:sites.values()
             ) {
            System.out.println(str);
        }

        System.out.println("-----------------------");
        //还可以通过一个循环，获取HashMap的key和value值 key为int值，value可以通过sites.get(i)获得
        for (int i:sites.keySet()
             ) {
            System.out.println("key的值为: " + i + "values值为: " + sites.get(i));
        }



        System.out.println("------我是分割线-------");

        //创建String的key和String的value
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("one","Google");
        map.put("two","Baidu");
        map.put("Three","Zhihu");
        map.put("Four","JD");

        System.out.println(map);

        map.remove("one");

        System.out.println(map); //无序的，但是删除了 one = Google

        map.clear();

        System.out.println(map); //HashMap中的所有元素都删除


    }
}

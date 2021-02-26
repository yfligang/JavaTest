package com.liepin.rim.org.day01;

import java.util.*;
//按照这个方法，只能找到出现重复次数最多是多少，不知道对应的是哪些元素
public class Demo01 {
    //随机生成100个100以内的数，查找到出现重复次数的数并算出出现多少次
    /*
    1.先找到随机100个100以内的随机数
     */
    public static void main(String[] args){
        Demo01 demo01 = new Demo01();
        demo01.randomNum(5,6); //其中x为一共多少个数，y为 [0,y)之间
    }

    public void randomNum(int x,int y){
        ArrayList<Integer> array = new ArrayList<>();
        //Random类的对象
        Random rm = new Random();
        //随机找到 [0,101)之间的数,需要找到100个，使用循环
        for (int i = 0; i < x; i++) {
            int num = rm.nextInt(y);
            array.add(num);
        }
        System.out.println(array); //可以打印的原因是重写了 toString方法

        //找到集合中出现重复的数和对应的次数
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num:array
             ) {
            if (!map.containsKey(num)){
                map.put(num,1);
            }else if (map.containsKey(num)){
                map.put(num,map.get(num) + 1);
            }
        }
        System.out.println(map);
        System.out.println("=====================================>");
        //找出map中出现次数最多的数和对应的次数
        ArrayList<Integer> list = new ArrayList<>();
        for (int num:map.values()
             ) {
            list.add(num);
        }
        System.out.println(list);
        //取出所有value后，找到list中的最大值 Collections.sort()方法
        System.out.println("==============================================");
        Collections.sort(list);
        System.out.println(list);
        //最大的为最后一位
        int num02 = list.get(list.size()-1);
        System.out.println("出现最多重复次数为: " + num02);



    }
}

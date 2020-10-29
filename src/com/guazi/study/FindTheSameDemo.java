package com.guazi.study;

import java.text.SimpleDateFormat;
import java.util.*;

import static com.sun.tools.doclint.Entity.sim;

public class FindTheSameDemo {

    public static void main(String[] args) {
        int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2, 9, 2};
        int count = 0;
        //找到数组中重复的元素和次数
        for (int i = 0; i < my_array.length; i++) {
            for (int j = i + 1; j < my_array.length; j++) {
                if (my_array[i] == my_array[j]){
                    count++;
                }
            }
            if (count == 1){
                System.out.println(my_array[i]);
            }
            count = 0;
        }


    }
}

class TestMyMethod{
    public static void main(String[] args){
        int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2, 9, 2,2};
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0; i < my_array.length; i++) {
            for (int j = i + 1; j < my_array.length; j++) {
                if (my_array[i] == my_array[j]){
                    map.put(my_array[i],0);
                }
            }

        }

        for (int num:map.keySet()
             ) {
            System.out.println(num);
        }



    }
}


class ArrayListTestDemo{
    public static void main(String[] args){
        //创建一个数组
        List list = new ArrayList<>();
        list.add("第一个元素");
        list.add("第二个元素");
        list.add("第三个元素");
        System.out.println(list);
        //删除第二个元素
        list.remove(1);
        System.out.println(list);
    }


}

class RemoveAllTestDemo{
    public static void main(String[] args){
        List list1 = new ArrayList();
        List list2 = new ArrayList();
        list1.add(1);
        list1.add(1);
        list1.add("test");
        list2.add("test");
        list1.removeAll(list2);
        System.out.println("list1和list2的差集为: " + list1);
    }
}

class JiaoJiTestDemo{
    public static void main(String[] args){
        List list3 = new ArrayList();
        List list4 = new ArrayList();
        list3.add(1);
        list3.add(1);
        list3.add("test");
        list4.add("test");
        list3.retainAll(list4);
        System.out.println("list3和list4的并集为: " + list3);
    }
}

class UnionTestDemo{
    public static void main(String[] args){
        String[] arg1 = {"1","2","3"};
        String[] arg2 = {"5","6","7"};
        String[] arg3 = union(arg1,arg2);
        for (String str:arg3
             ) {
            System.out.println(str);
        }

    }

    public static String[] union(String[] arg1,String[] arg2){
        Set<String> set = new HashSet<String>();

        for (String str:arg1) {
            set.add(str);
        }

        for (String str:arg2){
            set.add(str);
        }

        String[] result = {};

        return set.toArray(result);
    }
}

class TimeFormatDemo{
    public static void main(String[] args){
        //格式化时间
        Date date = new Date();
        String strDateFormat = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
        System.out.println(sdf.format(date));

    }
}
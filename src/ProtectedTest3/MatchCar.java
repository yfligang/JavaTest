package ProtectedTest3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MatchCar {

    public static void main(String[] args) {
        //创建一个ArrayList集合
        List<String> list = new ArrayList<String>();
        //向集合list中添加元素,使用add方法
        list.add("Hello");
        list.add("World");
        list.add("China");

        //第一种遍历方法用for-each增强型for
        for (String str:list
             ) {
            System.out.println(str);
        }

        System.out.println("-----------------------分隔符");

        //第二种遍历,把链表变为数组相关的内容进行遍历
        String[] strArray = new String[list.size()]; //list是链表
        list.toArray(strArray);
        for (String str:strArray
             ) {
            System.out.println(str);
        }
        System.out.println("------------------------分隔符");

        //第三种遍历，使用迭代器进行相关遍历
        Iterator<String> ir = list.iterator();
        //判断下一个元素之后有值
        while (ir.hasNext()){ //保证下一个元素之后肯定有值 while (true)
            System.out.println(ir.next());
        }

        String s = "How are you? Fine, thank you, and you?";
        System.out.println(s.length());
        System.out.println("-------------------");
        System.out.println(s.contains("you")); //布尔值，是否包含
        System.out.println("--------------------");

        ArrayList<String> al = new ArrayList<String>();
        al.add(s);
        for (String str:al
             ) {
            System.out.println(str);
        }
        System.out.println("-------------------------");

        int count = 0;
        for (int i = 0; i < al.size() - 2; i++) {
            if (al.get(i) == "y" && al.get(i+1) == "o" && al.get(i+2) == "u"){
                count += 1;
            }
        }
        System.out.println("you出现的次数" + count );


    }


}

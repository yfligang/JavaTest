package WeekendTest;

import java.util.Hashtable;

public class EasyTypeCool {
    public static void main(String[] args) {
        String str1 = "where is your school?";
        String str2 = "this is a good school";

        boolean match1 = str1.regionMatches(14,str2,15,6);
        boolean match2 = str1.regionMatches(true,14,str2,15,6);//第一个参数true表示忽略大小写区别

        System.out.println("区分大小写返回值 " + match1);
        System.out.println("不区分大小写返回值 " + match2);

        String str3 = "Hello,world!";
        String str4 = "hello,World!";

        boolean match3 = str3.regionMatches(6,str4,6,5);
        boolean match4 = str4.regionMatches(true,6,str4,6,5);

        System.out.println("区分大小写返回值 " + match3);
        System.out.println("不区分大小写返回值 " + match4);

        String name = "who are you ?";
        System.out.println(name + 1);
        System.out.println("-----------------------");

        Hashtable ht = new Hashtable();
        ht.put(1,"key");
        for (Object object:ht.values()
             ) {
            System.out.println(object);
        }
        System.out.println("_________________");

        Hashtable ht1 = new Hashtable(1); //只有1个
        ht1.put("cool",1);
        ht1.put("too",10);
        ht1.put(12,"opo");


        for (Object ob1:ht1.values()
             ) {
            System.out.println(ob1);
        }

        Hashtable ht2 = new Hashtable(10, 0.75f);

    }
}

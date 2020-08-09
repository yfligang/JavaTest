package WeekendTest;

import java.util.StringTokenizer;

public class LiuLangJianKe {
    //使用split分割字符/使用StringTokenizer来分割字符

    public static void main(String[] args) {
        String str = "Happy birthday, rpc!";
        //将字符串从th处分割 split
        String[] arg = str.split("th");
        for (String str1:arg
             ) {
            System.out.println(str1);
        }

        System.out.println("----------------------");

        //使用StringTokenizer类进行分割 还是 th
        StringTokenizer st = new StringTokenizer(str,"th");
        while(st.hasMoreElements()){
            System.out.println(st.nextElement());
        }
        System.out.println("----------------------");

        String str1 = "Hello,world,etst";
        String[] arg1 = str1.split("el");
        for (String str2:arg1
             ) {
            System.out.println(str2);
        }
        System.out.println("----------------------");
        StringTokenizer st1 = new StringTokenizer(str1,"el");
        while (st1.hasMoreElements()){
            System.out.println(st1.nextElement());
        }


    }
}

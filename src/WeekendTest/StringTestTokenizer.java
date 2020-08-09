package WeekendTest;

import java.util.StringTokenizer;

public class StringTestTokenizer {

    public static void main(String[] args) {
        String str = "He , llo , wor, ld!";
        String str1 = str.trim(); //去掉首尾空格
        String str2 = str.replace(" ","");
        System.out.println(str2);
        //使用StringTokenizer来分割字符串

        StringTokenizer st = new StringTokenizer(str); //通过空格分割

        while(st.hasMoreElements()) {
            System.out.println(st.nextElement());
        }
        //通过逗号来分割
        StringTokenizer st1 = new StringTokenizer(str,","); //实例化对象
        while (st1.hasMoreElements()){
            System.out.println(st1.nextElement());
        }

    }
}

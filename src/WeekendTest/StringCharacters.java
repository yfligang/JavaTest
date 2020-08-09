package WeekendTest;

import java.io.BufferedReader;

public class StringCharacters {

    public static void cool(){
        //反转Strig字符串
        String str = "12345";
        String str1 = new StringBuffer(str).reverse().toString();
        System.out.println(str1);
    }

    public static void test(){
        //String转为char
        char c = 'A';
        String str = String.valueOf(c);
        System.out.println(str);
    }

    public static void main(String[] args) {
        String str = "Hello World!";
        //替换字符串中的两个字符
        String str1 = str.replace('E','W'); //如果原字符串中没有该字符，则不变 char字符
        String str2 = str.replaceFirst("Hello","eH");  //替换 字符串
        String str3 = str.replaceAll("","123456");

        //System.out.println(str1);
        //System.out.println(str2);
        //System.out.println(str3);
        //reverse();
        //reverseString();
        //test();
        changeRound();

    }

    //字符串的反转
    public static void reverse(){
        String str = "Hello\nworld!";
        String[] args = str.split("|");
        for (String str1:args
             ) {
            System.out.print(str1);
        }
    }

    /**
     * 这是第一种方法，先将String转换为char数组，然后交换后，读取新的char数组的内容
     */
    public static void reverseString(){
        String str = "China No. one";
        char[] ch = str.toCharArray();
        for (char c:ch
             ) {
            //System.out.println(c);
        }

        char[] th = new char[str.length()];
        for (int i = 0,j = ch.length -1; i < ch.length; i++,j--) {
            th[i] = ch[j];
        }


        for (char mk:th
             ) {
            System.out.print(mk);
        }



    }

    public static void changeRound(){
        //将字符串调换
        String str = "hello";
        String str1 = new StringBuffer(str).reverse().toString();
        System.out.println(str1);

    }





}

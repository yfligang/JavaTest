package WorkStudy;

import sun.rmi.runtime.Log;

import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {

        /*
        Scanner类中next的用法
         */
        //System.out.println("程序顶端输入验证: ");
        Scanner s = new Scanner(System.in);
        //从键盘接收数据

        //next方式接收字符串
        System.out.println("next方式接收: ");

        //判断是否还有输入
        if (s.hasNext()){
            String str = s.next();
            System.out.println("next()的值为: " + str);
        }


        /*
        Scanner类中nextLine的方法
         */
        System.out.println("为nextLine()准备的值: ");
        String str3 = s.nextLine();
        String str2 = s.nextLine();
        System.out.println("nextLine()的值为: " + str2);

        s.close();

    }

}

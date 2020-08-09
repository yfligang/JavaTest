package TianAnMen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//用户输入字符q后，程序停止运行
public class BBRScanner {
    public static void main(String[] args) throws IOException {
        char c;
        Scanner sc = new Scanner(System.in); //不需要使用
        System.out.println("请输入字符: ");

        do {
            c = sc.next().charAt(0);
            System.out.println(c);
        }while(c != 'q');

        System.out.println("循环结束了");


    }
}

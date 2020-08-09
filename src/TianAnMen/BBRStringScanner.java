package TianAnMen;

import java.io.IOException;
import java.util.Scanner;

//用户输入字符串 end 结束循环
public class BBRStringScanner {

    public static void main(String[] args) throws IOException {
        String c;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串: ");

        do {
            c = sc.nextLine();
            System.out.println(c);
        }while (!c.equals("end"));

        System.out.println("终于找到你了!!");
    }
}

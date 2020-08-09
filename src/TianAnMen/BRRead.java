package TianAnMen;

import java.io.*;

public class BRRead {

    public static void main(String[] args) throws IOException {
        char c;

        //使用System.in 创建BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符，按下 'q'键退出");

        do {
            c = (char)br.read(); //输入的字符转换为char后赋值给c 如果输入的字符不是 q, 则返回输入的字符c
            System.out.println(c);
        }while(c != 'q'); //当输入的字符包含q的时候，就会自动退出

        }

}

package TianAnMen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//程序读取和显示字符行直到你输入了单词"end"
public class BBReadLines { //在声明类的地方，不能抛出异常
    public static void main(String[] args) throws IOException { //可以在类的主方法抛出异常
        String str;
        //调用BufferedReader类的readLine()方法
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入单词 'end' 结束循环");

        do {
            str = br.readLine();
            System.out.println(str);
        }while (!str.equals("end"));

    }
}

package TianAnMen;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OfficeBetter {

    public static void main(String[] args) {
        try {

//            Class c = Class.forName(args[0]); //args[0] 是一个字符串, 加载类的类类型
//            OfficeAble oa = (OfficeAble) c.newInstance();
//            oa.start();

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            //可以用read()方法从控制台读取一个字符，或者用readLine()方法读取一个字符串
            br.read();
//            int num = br.read();
//            System.out.println(num);
//            br.readLine();
//            String str = br.readLine();
//            System.out.println(str);
        }catch (Exception e){
            e.printStackTrace();
        }


    }




}

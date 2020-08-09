package netStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class WriteSelf {
    //从一个网页中获取网页资源 例如: https://www.163.com

    public void net(){
        try {
            //先用String字符串声明一个网址
            String str = "https://www.baidu.com";
            //URL类的实例化
            URL url = new URL(str); //url就是str的内容了
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();//HttpURLConnection是个抽象类
            connection.setRequestMethod("GET"); //方式为GET
            connection.connect(); //连接建立了


            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream())); //从url的
            String current = "";
            while (br.readLine() != null){
                current = current + br.readLine();

            }
            System.out.println(current);

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        WriteSelf ws = new WriteSelf();
        ws.net();
    }

}

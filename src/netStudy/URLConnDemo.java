package netStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class URLConnDemo {
    //URL采用了HTTP 协议  openConnection 返回HttpURLConnection对象

    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.runoob.com");
            URLConnection urlConnection = url.openConnection();
            HttpURLConnection httpURLConnection = null;
            if (urlConnection instanceof HttpURLConnection){
                httpURLConnection = (HttpURLConnection)urlConnection;
            }else {
                System.out.println("请输入URL地址");
                return;
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            String urlString = "";
            String current;
            while ((current = br.readLine()) != null){
                urlString = urlString + current;
            }
            System.out.println(urlString);


        }catch (IOException e){
            e.printStackTrace();
        }
    }


}

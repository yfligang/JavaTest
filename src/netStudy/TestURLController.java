package netStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class TestURLController {

    public void testURL(){
        try {
            String str = "https://www.baidu.com";
            URL url = new URL(str);
            //得到connection对象
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection(); //打开一个URL链接
            //设置请求方式
            httpURLConnection.setRequestMethod("GET");
            //连接
            httpURLConnection.connect(); //连接建立
            //得到响应码
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                InputStream inputStream = httpURLConnection.getInputStream();
                //获取响应
                BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
                String line;
                while ((line = br.readLine()) != null){
                    System.out.println(line);
                }

                br.close();
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TestURLController tuc = new TestURLController();
        tuc.testURL();
    }
}

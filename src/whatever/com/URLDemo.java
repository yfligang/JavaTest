package whatever.com;

import java.io.IOException;
import java.net.URL;

public class URLDemo {

    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.runoob.com/index.html?language=cn#j2se"); //URL地址
            System.out.println("URL为: " + url.toString()); //转换为字符串
            System.out.println("协议为: " + url.getProtocol()); //获取url的协议
            System.out.println("host为: " + url.getHost());
            System.out.println("port为: " + url.getPort());
            System.out.println("path为: " + url.getPath());
            System.out.println("query为: " + url.getQuery());
            System.out.println("fragment为: " + url.getRef()); //定位位置
            System.out.println("默认端口号: " + url.getDefaultPort());
            System.out.println("file为: " + url.getFile()); //文件名和请求参数

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

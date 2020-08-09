package whatever.com;

import java.io.*;

public class FileStreamTest {

    public static void main(String[] args) {

        try {
            //创建一个byte数组
            byte[] bWrite = {11,22,33,44,55};
            OutputStream os = new FileOutputStream("test.txt");
            for (int x = 0;x < bWrite.length; x++){
                os.write(bWrite[x]);
            }
            os.close(); //关闭连接

            InputStream is = new FileInputStream("test.txt");
            int size = is.available();

            for (int i = 0; i < size; i++) {
                System.out.print(is.read() + " ");
            }
            is.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }

}

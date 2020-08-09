package whatever.com;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

public class GreetingServer extends Thread {

    private ServerSocket serverSocket;  //定义一个类变量?

    public GreetingServer(int port) throws IOException{

        serverSocket = new ServerSocket(port);
        serverSocket.setSoTimeout(10000);
    }

    @Override
    public void run() {
        while(true){
            try {
                System.out.println("等待远程连接，端口号为: " + serverSocket.getLocalPort() + "..." );
                Socket server = serverSocket.accept();
                System.out.println("远程主机地址: " + server.getRemoteSocketAddress());
                DataInputStream in = new DataInputStream(server.getInputStream());
                System.out.println(in.readUTF());
                DataOutputStream out = new DataOutputStream(server.getOutputStream());
                out.writeUTF("谢谢连接我: " + server.getLocalSocketAddress() + "\nGoodbye!");
                server.close();

            }catch (SocketTimeoutException e){
                System.out.println("Socket timed out!");
                break;
            }catch (IOException e){
                e.printStackTrace();
                break;
            }
        }
    }
}

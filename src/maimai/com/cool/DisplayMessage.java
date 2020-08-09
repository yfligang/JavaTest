package maimai.com.cool;
//实现runnable接口
public class DisplayMessage implements Runnable{

    private String message;

    public DisplayMessage(String message){
        this.message = message; //将实例化输入的message传给DisplayMessage类的有参构造函数
    }

    @Override
    public void run() {
        while(true){
            System.out.println(message);
        }
    }
}

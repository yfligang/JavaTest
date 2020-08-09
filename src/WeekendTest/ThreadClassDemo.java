package WeekendTest;
//通过实现Runnable接口创建线程
public class ThreadClassDemo implements Runnable {
    public int i = 5;
    private String threadName;

    public ThreadClassDemo(String name){
        threadName = name;
    }

    @Override
    public void run() {
        while(i > 4){
            System.out.println(threadName);
        }
    }
}

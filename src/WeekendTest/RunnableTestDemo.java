package WeekendTest;

public class RunnableTestDemo implements Runnable {

    private Thread thread;  //定义线程的对象
    private String threadName;

    RunnableTestDemo(String name){ //有参构造函数
        threadName = name; //将传入的参数 name值赋给threadName
        System.out.println("creating" + threadName);
    }

    @Override
    public void run() {  //run方法
        System.out.println("Running" + threadName); //running和线程名
        try{
            for (int i = 4; i > 0 ; i--) {
                System.out.println("Thread: " + threadName + "," + i);
                //线程睡眠5秒
                Thread.sleep(5);
            }
        }catch (InterruptedException e){
            System.out.println("Thread" + threadName + " interrupted. ");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }

    public void start(){
        System.out.println("Starting " + threadName);
        if (thread == null){ //判断线程是否在运行中， == null 就是不运行了
            thread = new Thread(this,threadName);
            thread.start();
        }
    }


}

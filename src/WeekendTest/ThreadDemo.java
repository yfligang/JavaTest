package WeekendTest;
//首先是新建的类需要继承Thread类
public class ThreadDemo extends Thread {

    private Thread thread; //创建一个线程thread
    private String threadName; //创建线程对应的名称为 threadName

    //调用有参的构造函数，主要是通过构造函数，将对象实例化时的threadName传参进来
    public ThreadDemo(String name){
        threadName = name;
        System.out.println("creating" + threadName);
    }

    //需要重写run()方法
    @Override
    public void run() {
        System.out.println("Running" + threadName);
        super.run();
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + " , " + i);
                Thread.sleep(5); //如果使用sleep的方法，需要抛出异常
            }
        }catch (InterruptedException e){
            System.out.println("Thread: " + threadName + "interrrupted.");
        }
        System.out.println("Thread: " + threadName + "exiting.");
    }

    //开始写start()方法
    public void start(){
        if (thread == null){ //线程没有在运行
            System.out.println("Thread: " + threadName + "starting.");
            thread = new Thread(this,threadName); //给thread赋值，target就是当前的值
            thread.start();
        }
    }
}

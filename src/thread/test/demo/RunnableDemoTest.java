package thread.test.demo;

//使用Runnable来创建线程
public class RunnableDemoTest implements Runnable { //Runnable之中没有getName方法

//    public RunnableDemoTest(String name){
//        this.threadName = name;
//
//    }
    @Override
    public void run() {

        System.out.println("开始");

    }

    public static void main(String[] args) {
        RunnableDemoTest runnableDemoTest = new RunnableDemoTest(); //先实例化
        Thread thread = new Thread(runnableDemoTest, "Mr.Thread");
        //使用implements Runnable时，创建线程不能直接用 Thread thread = new 类(); 会报错
        thread.start();

        System.out.println(thread.getName());
        Thread.yield();

        //已经没有Thread.stop()这个方法了

    }

    enum Color{
        red,yellow,green;
    }

    public RunnableDemoTest(){
        Color color = Color.green;
        switch (color){
            case red:
                System.out.println("红色");
                break;
            case yellow:
                System.out.println("黄色");
                break;
            case green:
                System.out.println("绿色");
                break;
        }
    }
}

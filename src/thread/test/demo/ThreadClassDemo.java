package thread.test.demo;
//继承Thread类来创建线程
public class ThreadClassDemo extends Thread {

    @Override
    public void run() { //运行线程
        System.out.println(getName() + "是一个演员!"); //线程开始
        int count = 0;
        boolean keepRunning = true;
        while(keepRunning){
            System.out.println(getName() + "登台演出" + (++count));
            if (count == 100){
                keepRunning = false; // == 100后，会退出循环
            }
            //可以让程序休眠下，使用 sleep的方法
            try {
                if (count % 10 == 0){
                    //可以直接使用sleep方法，或者用Thread.sleep来

                    sleep(1000); //需要使用try-catch来抛出异常 sleep是静态方法，可以直接调用
                    System.out.println("这里有一个停顿");
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }


        }
        System.out.println(getName() + "的演出结束了!");

    }

    public static void main(String[] args) {
        Thread actor = new ThreadClassDemo(); //创建线程actor
        //设置线程的名字，通过 setName
        actor.setName("Mr.Thread");
        System.out.println(actor.getName());

        //线程开始运行
        actor.start(); //可以引用start()方法，也可以创建一个start()方法
    }
}

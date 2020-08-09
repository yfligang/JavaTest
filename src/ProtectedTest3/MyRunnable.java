package ProtectedTest3;

public class MyRunnable implements Runnable {

    private volatile boolean active;

    public void run(){  //线程开始?
        int m = 10;
        active = true;
        for (int i = 0; i < m; i++) {
            System.out.println("Hello" + active);
        }
    }

    public void stop(){

        active = false;
        System.out.println("线程结束了");
    }

    public static void main(String[] args){

        MyRunnable mr = new MyRunnable();

        mr.run();
        mr.stop();
    }
}

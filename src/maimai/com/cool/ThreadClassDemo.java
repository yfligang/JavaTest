package maimai.com.cool;

public class ThreadClassDemo {

    public static void main(String[] args) {
        DisplayMessage dm = new DisplayMessage("Hello"); //通过实例化创建一个新线程
        Runnable ra = new DisplayMessage("World!"); //通过实例化创建一个新线程
        Thread thread1 = new Thread(dm);
        Thread thread2 = new Thread(ra);
        thread1.setDaemon(true); //Daemon thread为低优先级的线程
        thread1.setName("hello");
        System.out.println("Starting hello thread...");
        thread1.start();

        DisplayMessage dm1 = new DisplayMessage("China");
        Runnable ra1 = new DisplayMessage("Goodbye");
        Thread thread3 = new Thread(dm1);
        Thread thread4 = new Thread(ra1);
        thread3.setPriority(Thread.MIN_PRIORITY); //public final static int MIN_PRIORITY = 1;
        thread3.setDaemon(true);
        System.out.println("Starting goodbye thread...");
        thread3.start();

        System.out.println("starting thread4....");
        Thread thread5 = new GuessANumber(27);
        thread4.start();
        try {
            thread4.join();
        } catch (InterruptedException e) {
            System.out.println("Tjread interrupted");
        }

        System.out.println("Strating thread5...");
        Thread thread6 = new GuessANumber(72);

        thread5.start();
        System.out.println("main() is ending...");
    }

}

package WeekendTest;

public class TestThreadDemo {

    public static void main(String[] args) {

//        RunnableTestDemo rtd1 = new RunnableTestDemo("Thread-1");
//        rtd1.start();
//
//        RunnableTestDemo rtd2 = new RunnableTestDemo("Thread-2");
//        rtd2.start();

        ThreadDemo td1 = new ThreadDemo("1-Thread");
        td1.start();

        ThreadDemo td2 = new ThreadDemo("2-Thread");
        td2.start();
    }
}

package leaveForRun;

//定义Fish类，它实现了Animal接口的方法run()和breather()
public class Fish implements Runner,Animal{

    @Override
    public void run() { //实现了Runner接口中的方法 run
        System.out.println("实现了Runner接口中的方法 run");
    }

    @Override
    public void breathe() { //实现了Animal接口的breathe方法
        System.out.println("实现了Animal接口的breathe方法");
    }

    public static void main(String[] args) {

    }
}

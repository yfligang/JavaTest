package WorkStudy;

public class OverloadingTestDemo {

    public OverloadingTestDemo(){
        System.out.println("我是第一名");
    }

    public OverloadingTestDemo(int i){
        System.out.println(i);
    }

    public static void main(String[] args){
        //类的实例化
        MyOverloading ml = new MyOverloading(1); //调用  public MyOverloading(int i) 构造函数
        ml.info(); //调用实例化类的无参方法
        ml.info("Hello,world!"); //调用实例化类的有参方法
        //重载构造函数
        new MyOverloading(); //会再调用一次实例化类的无参构造函数
    }



}

class MyOverloading{
    int height;
    //无参构造函数
    public MyOverloading(){
        System.out.println("无参构造函数");
    }
    //有参构造函数
    public MyOverloading(int i){
        System.out.println("房子高度为: " + i + "米");
        height = i;
    }
    //无参方法
    public void info(){
        System.out.println("房子高度为 " + height + "米");
    }
    //有参方法
    public void info(String s){
        System.out.println(s + "房子高度为 " + height + "米");
    }


}
package ProtectedTest;

public class InstanceCounter {

    private static int num = 0;  //类常量

    protected static int getNum(){  //对外获取
        return num;
    }

    private static void setNum(){  //设置常量
        num++;
    }

    InstanceCounter(){  //无参构造方法
        InstanceCounter.setNum();
    }

    public static void main(String[] args){
        System.out.println("Starting with " + InstanceCounter.getNum() + " Instances");

        for (int i = 0; i < 500; i++) {
            new InstanceCounter();
        }

        System.out.println("Created " + InstanceCounter.getNum() + " Instances");
    }

    final int value = 10;
    //声明常量的实例
    public static final int BOXWIDTH = 10;
    static final String TITLE = "Manager";

    public void changeValue(){

    }


}

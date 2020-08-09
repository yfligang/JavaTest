package BasicFunction;

public class FinalizationDemo {

    public static void main(String[] args) {
        Cake c1 = new Cake(1); //类实例化对象，且new Cake方法的入参为1
        Cake c2 = new Cake(2);
        Cake c3 = new Cake(3);

        //c2 = c3 = null;
        System.gc(); //调用Java垃圾收集器
    }
}

//在同一个包下的类
class Cake extends Object{
    private int id;
    public Cake(int id){  //类Cake的有参构造方法，参数为id
        this.id = id; //前面的id 是类Cake的类变量 this.id 后面的id是构造方法Cake的入参，即构造方法入参传给类的变量
        System.out.println("Cake Object " + id + " is created");

    }

    protected void finalize() throws java.lang.Throwable {  //要回收
        super.finalize(); //super 超类 使用Object类的finalize()方法
        System.out.println("Cake Object" + id + " is disposed");
    }
}

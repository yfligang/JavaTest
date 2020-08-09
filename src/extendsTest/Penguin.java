package extendsTest;

public class Penguin extends Animal {
    //企鹅：属性（姓名，id），方法（吃，睡，自我介绍）
    //有参构造方法
    public Penguin(String myName,int myId){
        super(myName,myId);
        System.out.println("子类的构造方法");
    }

    public void funny(){
        System.out.println("我是子类的方法");
    }

    public static void main(String[] args) {
        Animal am = new Animal("hello",1);
        //没法调用子类的方法
        am.cool();
//        am.eat();
//        am.introduction();
//        am.sleep();
        System.out.println("我是分隔符------------");

        Animal am1 = new Penguin("cool",2);
        am.cool();
        //am.look();
//        am1.eat();
//        am1.introduction();
//        am1.sleep();
        System.out.println("我是分隔符------------");

        Penguin am2 = new Penguin("world",3);
        am2.funny();
        am.cool();

        //Penguin am3 = new Animal("zooker",100);

    }
}

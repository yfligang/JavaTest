package extendsTest;

public class Mouse extends Penguin{

    public Mouse(String myName,int myId){
        super(myName,myId);
    }

    public static void main(String[] args) {
        Animal am = new Mouse("xixihaha",123);
        am.cool();
    }

    public interface A {

        public void eat(); //抽象方法
        public void sleep();

    }

    public interface B {
        public void show();
        public void see();

    }

    //类继承接口(implements)，不是接口继承接口(extends)
    abstract class C implements A,B{

    }


}

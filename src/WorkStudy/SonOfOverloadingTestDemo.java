package WorkStudy;

public class SonOfOverloadingTestDemo extends OverloadingTestDemo {

    SonOfOverloadingTestDemo(){
        System.out.println("我是第二名");
    }

    SonOfOverloadingTestDemo(String s){
        System.out.println(s);
    }

    public static void main(String[] args){
        //OverloadingTestDemo ot = new OverloadingTestDemo(1);
        //SonOfOverloadingTestDemo sb = new SonOfOverloadingTestDemo();
        //SonOfOverloadingTestDemo sb1 = new SonOfOverloadingTestDemo("hello");
        OverloadingTestDemo ot1 = new SonOfOverloadingTestDemo("cool");
        //OverloadingTestDemo ot2 = new OverloadingTestDemo(2);
    }

}

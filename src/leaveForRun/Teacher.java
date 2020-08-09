package leaveForRun;

public class Teacher extends School { //子类

//    public Teacher(){
//        super();
//    }

    public Teacher(String str,int num){
        super("hello",1);
    }

    public static void main(String[] args) {
        Teacher tc = new Teacher("1",2); //父类有无参+有参构造方法，子类有有参构造方法，子类实例化也会调用父类的无参构造方法

    }


}

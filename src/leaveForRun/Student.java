package leaveForRun;

public class Student extends Person implements Runner {

    @Override
    public void run1() {
        super.run1();
    }

    public void run(){
        System.out.println("我是接口Runner中的抽象方法run");

    }

    public static void main(String[] args) {
        Student st = new Student();
        st.run();
    }
}

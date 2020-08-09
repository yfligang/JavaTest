package WorkStudy.StudayWork;

public interface yeXu {

    public void stop();

    //静态方法
    default String get(String aa){
        System.out.println("jdk1.8默认实现方法...");
        return aa;
    }

    //static方法
    static void cool(){
        System.out.println("heihei");
    }


}

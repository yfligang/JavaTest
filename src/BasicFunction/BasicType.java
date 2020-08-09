package BasicFunction;



public class BasicType {

    private boolean myFlag;
    static final double weeks = 9.5; //默认的default
    protected static final int BOXWIDTH = 42;

    String version = "1.5.0"; //default

    boolean processOrder(){
        System.out.println("true");
        return true;
    }

    private class Basic{

    }

    public void pupAge(){
        int age = 0;
        age = age + 7;
        System.out.println("小狗的年龄是: " + age);
    }

    public void puAge(){
        int age = 9;
        age = age + 7;
        System.out.println("小狗的年龄是: " + age);
    }

    public static void main(String[] args){

        BasicType bt = new BasicType();
        BasicDataType bdt = new BasicDataType();
        bt.pupAge();
        bt.puAge();
        bt.processOrder();


    }

    private String format; //设置一个私有实例变量

    //设置两个public方法，一个是返回format的值，一个是设置format的值
    public void setFormat(String format){
        this.format = format;
    }

    public String getFormat(){
        return this.format;
    }


}

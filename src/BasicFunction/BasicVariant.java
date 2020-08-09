package BasicFunction;

public class BasicVariant {

    //静态的私有变量
    private static double number;  //变量

    //常量
    public static final String DEPORMENT = "开发人员";


    //这个实例变量对子类可见
    public String name;  //默认值为null

    //私有变量，仅在该类实现
    private double salary;  //默认值为0.0

    //在构造器中对name赋值
    public BasicVariant(String empName){  //带参的构造方法
        name = empName;
    }

    //设定salary的值
    public void setSalary(double empSal){
        salary = empSal;
    }

    //打印信息
    public void printEmp(){
        System.out.println("名字: " + name );
        System.out.println("薪资: " + salary);

    }

    public static void main(String[] args){
        BasicVariant bv = new BasicVariant("Baggio"); //name的参数
        bv.setSalary(100); //数字的参数
        bv.printEmp(); //调用方法

        number = 1000;
        System.out.println(DEPORMENT + "的工资为: " + number ); //可以

    }

}

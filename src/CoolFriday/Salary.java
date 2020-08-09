package CoolFriday;

public class Salary extends Employee {

    private double salary; //全年工资

    public Salary(String name,String address,int number,double salary){ //有参构造方法
        super(name, address, number);


    }

    public void mailCheck() {
        System.out.println("Salary类的 mailCheck 方法 "); //子类方法可以直接调用父类有返回的方法，不能直接调用没有返回的方法
        System.out.println("邮寄支票给 "+ getName() + " ， 工资为: " + salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary){ //设置
        if (newSalary >= 0.0){
            salary = newSalary;
        }
    }

    public double computePay(){
        System.out.println("计算工资，付给：" + getName());
        return salary/52;
    }

}

package CoolFriday;

public class Employee {

    private String name;
    private String address; //私有的
    private int number;
    public Employee(String name,String address,int number){  //类Employee的有参构造方法
        System.out.println("Employee 构造函数");
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public void mailCheck(){ //创建一个没有返回的方法
        System.out.println("邮寄支票给: " + name + " " + address);
    }

    public String toString(){ //创建一个String方法，返回字符串
        return name + " " + address + " " + number;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String newAddress){
        address = newAddress;
    }

    public int getNumber(){
        return number;
    }

    public void cool(){
        System.out.println("父类的方法，子类可以直接调用吗?");
    }

}

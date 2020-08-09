package WorkStudy.StudayWork;

public abstract class Employee {

    private String name;
    private String address;
    private int number;

    public Employee(){
        System.out.println("Hello");
    }

    public Employee(String name,String address,int number){  //构造方法
        System.out.println("Construction an Employ");
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public double computePay(){
        System.out.println("Inside Employee computePay");
        return 0.0;
    }

    public void mailCheck(){
        System.out.println("Mailing a check to " + this.name + " " + this.address);
    }

    public String toString(){
        return name + " " + address + " " + number;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String newAddress) {
        this.address = newAddress;
    }

    public int getNumber() {
        System.out.println("getName");
        return number;
    }

//    //定义一个抽象方法
//    abstract void wolf();
//    //对抽象方法的重载
//    abstract void wolf(int i); //抽象类中可以对抽象方法进行重载
}

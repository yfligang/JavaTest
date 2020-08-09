package CoolFriday;

public class VirtualDemo {

    public static void main(String[] args) {
        Salary s = new Salary("员工A","北京",3,3600.00); //实例化并加入参数
        Employee e = new Employee("员工B","上海",2);
        Employee ee = new Salary("员工C","河南",12,1000.00);

        System.out.println("使用Salary的引用调用 mailCheck --");
        s.mailCheck();

        System.out.println("\n使用 Employee 的引用调用 mailCheck--");
        ee.mailCheck();
    }
}

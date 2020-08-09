package WorkStudy.StudayWork;

public class AbstractDemo extends Employee{


    public static void main(String[] args) {
        AbstractDemo abstractDemo = new AbstractDemo();
        abstractDemo.computePay();

        Employee employee1 = new AbstractDemo();
        employee1.mailCheck();

        Employee employee = new Employee("1","2",1) {
            @Override
            public double computePay() {
                return super.computePay();
            }

            @Override
            public void mailCheck() {
                super.mailCheck();
            }

            @Override
            public String toString() {
                return super.toString();
            }

            @Override
            public String getName() {
                return super.getName();
            }

            @Override
            public String getAddress() {
                return super.getAddress();
            }

            @Override
            public void setAddress(String newAddress) {
                super.setAddress(newAddress);
            }

            @Override
            public int getNumber() {
                return super.getNumber();
            }
        };

        employee.computePay();
        employee.getAddress();
        employee.getName();
        employee.getNumber();
        employee.mailCheck();
        employee.setAddress("北京");
        employee.toString();

    }
}

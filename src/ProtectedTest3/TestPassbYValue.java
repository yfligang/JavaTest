package ProtectedTest3;

public class TestPassbYValue {

    //创建一个方法，该方法用于交换两个变量
    public static void swap(int m,int n){
        int temp = 0;
        temp = n; //temp = 2
        n = m; //将n的值赋给m
        m = temp;
        System.out.println("交换后的值为 " + m +" " + n); //这里的m和n是已经通过方法交换后的值
    }

    public static void swap(double m,double n){
        double temp = 0.0;
        temp = n; //temp = 2
        n = m; //将n的值赋给m
        m = temp;
        System.out.println("交换后的值为 " + m +" " + n);
    }

    public static void main(String[] args) {
        int m = 1;
        int n = 2;
        swap(m,n);
        System.out.println("交换前的值为 " + m + "交换后的值为 " + n); //这里的m和n是主方法里的m和n  方法调用后，实参的值并没有改变
        double m1 = 0.5;
        double n1 = 1.2;
        swap(m1,n1);
        System.out.println("交换前的值为 " + m1 + "交换后的值为 " + n1);
    }
}

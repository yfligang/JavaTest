package ProtectedTest3;

public class VarargsDemo {

    public static void main(String[] args) {
        //调用可变参数的方法
        printMax(34,3,3,2,56.5);
        printMax(new double[]{1,2,3});
        printMax();
    }

    public static void printMax(double...nums){
        if (nums.length == 0){
            System.out.println("No argument passed");
            return;
        }

        double result = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > result){
                result = nums[i];
            }
        }

        System.out.println("The max value is " + result);
    }
}

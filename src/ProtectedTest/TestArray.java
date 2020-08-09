package ProtectedTest;

public class TestArray {

    public static void main(String[] args){
        //数组大小
        int size = 10;

        //定义数组
        double[] myList = new double[size];
        myList[0] = 1.0;
        myList[1] = 2.0;
        myList[2] = 3.0;
        myList[3] = 4.0;
        myList[4] = 5.0;
        myList[5] = 6.0;
        myList[6] = 7.0;
        myList[7] = 8.0;
        myList[8] = 9.0;
        myList[9] = 10.0;
        //myList[10] = 11.0;

        double num2 = 0.0;
        for (int i = 0; i < size; i++) {
            num2 = myList[i] + num2;
        }

        System.out.println(num2);

        for (double num1:myList
             ) {
            System.out.println(num1);
        }

    }
}

package ProtectedTest3;
import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args){
        int[] array = {1,4,112,2,45,6,8,21,0,2};
        int[] array1 = {2,5,66,12,45,6,7,99,7,121};

        boolean isMatch = Arrays.equals(array,array1);
//        System.out.println(isMatch);

        int[] array2 = new int[5];
        //Arrays.fill(array2,1);
        Arrays.fill(array2,0,3,1);

        for (int num1:array2
             ) {
            System.out.println(num1);
        }

        //使用Arrays.equal(数组1，数组2)方法
        String[] str1 = {"h","l","o"};
        String[] str2 = {"h","l","o"};
        boolean isMatch1 =  Arrays.equals(str1,str2);
        System.out.println(isMatch1);



//        Arrays.sort(array);
//
//        for (int num:array
//             ) {
//            System.out.println(num);
//        }

        BinarySearch.match(1,2);
        BinarySearch.match(12,12);
        BinarySearch.match(5,1);
    }

    //定义一个方法，返回两个值中的最大值
    public static int match(int num1, int num2){ //void就不能添加返回类型了
        int result;
        if (num1 < num2){
            result = num2;
            System.out.println("两个数中最大的值为 " + result);
        }else{
            result = num1;
            System.out.println("两个数中最大值为 " + result);
        }
        return result;
    }

}
